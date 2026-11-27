package defpackage;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Tp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2094Tp0 {

    @NotNull
    public final MI a;

    public C2094Tp0(@NotNull MI configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.a = configuration;
    }

    @NotNull
    public static InputStream a(@NotNull HttpURLConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        try {
            InputStream inputStream = connection.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "{\n            connection.inputStream\n        }");
            return inputStream;
        } catch (IOException unused) {
            InputStream errorStream = connection.getErrorStream();
            Intrinsics.checkNotNullExpressionValue(errorStream, "{\n            connection.errorStream\n        }");
            return errorStream;
        }
    }

    @NotNull
    public final C2016Sp0 b() throws IOException {
        MI mi = this.a;
        mi.getClass();
        String str = mi.h == EnumC4851kI1.e ? "https://api.eu.amplitude.com/2/httpapi" : "https://api2.amplitude.com/2/httpapi";
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            Intrinsics.c(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(201000);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            Intrinsics.checkNotNullExpressionValue(outputStream, "connection.outputStream");
            return new C2016Sp0(httpURLConnection, outputStream, this);
        } catch (MalformedURLException e) {
            throw new IOException(C5491nL.c("Attempted to use malformed url: ", str), e);
        }
    }
}
