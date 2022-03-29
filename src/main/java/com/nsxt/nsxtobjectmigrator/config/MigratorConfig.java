package com.nsxt.nsxtobjectmigrator.config;

import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import javax.net.ssl.SSLException;


/**
 * <h1>MigratorConfig</h1>
 * Initializes the Webclient
 *
 * @author Riaz Mohamed
 * @version 1.0
 * @since 03/24/2022
 */

public class MigratorConfig {

    @Value( "${nsx.service.from.baseurl}" )
    private String nsxFromBaseUrl;
    @Value( "${nsx.service.from.user}" )
    private String nsxFromUser;
    @Value( "${nsx.service.from.password}" )
    private String nsxFromPassword;
    @Value( "${nsx.service.to.baseurl}" )
    private String nsxToBaseUrl;
    @Value( "${nsx.service.to.user}" )
    private String nsxToUser;
    @Value( "${nsx.service.to.password}" )
    private String nsxToPassword;


    @Bean(name = "toNSXTClient")
    @Description("customer web client")
    public WebClient restClientTo() throws SSLException, InterruptedException {

        return initalizeHttpClient(nsxToBaseUrl,nsxToUser,nsxToPassword);
    }

    @Bean(name = "fromNSXTClient")
    @Description("customer web client")
    public WebClient restClientFrom() throws SSLException, InterruptedException {


        return initalizeHttpClient(nsxFromBaseUrl,nsxFromUser,nsxFromPassword);

    }

    private WebClient initalizeHttpClient(String nsxBaseUrl, String nsxUser, String nsxPassword ) throws SSLException, InterruptedException
    {

        ExchangeStrategies exchangeStrategies = ExchangeStrategies.builder()
                .codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(10 * 1024 * 1024)).build();

        SslContext sslContext = SslContextBuilder
                .forClient()
                .trustManager(InsecureTrustManagerFactory.INSTANCE)
                .build();
        HttpClient httpClient = HttpClient.create().secure(t -> t.sslContext(sslContext));

        return WebClient.builder().clientConnector(new ReactorClientHttpConnector(httpClient))
                .exchangeStrategies(exchangeStrategies)
                .baseUrl(nsxBaseUrl)
                .defaultHeaders(header -> header.setBasicAuth(nsxUser,nsxPassword))
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();


    }



}
