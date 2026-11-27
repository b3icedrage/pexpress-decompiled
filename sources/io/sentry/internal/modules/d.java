package io.sentry.internal.modules;

import defpackage.NG1;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements b {
    public static final Charset d = Charset.forName("UTF-8");

    @NotNull
    public final ILogger a;

    @NotNull
    public final C4527a b = new C4527a();

    @Nullable
    public volatile Map<String, String> c = null;

    public d(@NotNull ILogger iLogger) {
        this.a = iLogger;
    }

    @Override // io.sentry.internal.modules.b
    @Nullable
    public final Map<String, String> a() {
        if (this.c == null) {
            C4527a.C0404a c0404aA = this.b.a();
            try {
                if (this.c == null) {
                    this.c = b();
                }
                c0404aA.close();
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.c;
    }

    public abstract Map<String, String> b();

    public final TreeMap c(@NotNull InputStream inputStream) {
        ILogger iLogger = this.a;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                iLogger.a(NG1.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            iLogger.d(NG1.ERROR, "Error extracting modules.", e);
            return treeMap;
        } catch (RuntimeException e2) {
            iLogger.c(NG1.ERROR, e2, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
