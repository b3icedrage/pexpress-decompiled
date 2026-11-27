package io.sentry.cache;

import defpackage.C2688aH1;
import defpackage.NG1;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final Charset a = Charset.forName("UTF-8");

    public static void a(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull String str, @NotNull String str2) {
        File fileB = b(sentryAndroidOptions, str);
        if (fileB == null) {
            sentryAndroidOptions.getLogger().a(NG1.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        sentryAndroidOptions.getLogger().a(NG1.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    @Nullable
    public static File b(@NotNull C2688aH1 c2688aH1, @NotNull String str) {
        String cacheDirPath = c2688aH1.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    @Nullable
    public static Object c(@NotNull C2688aH1 c2688aH1, @NotNull String str, @NotNull String str2, @NotNull Class cls) {
        File fileB = b(c2688aH1, str);
        if (fileB == null) {
            c2688aH1.getLogger().a(NG1.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (!file.exists()) {
            c2688aH1.getLogger().a(NG1.DEBUG, "No entry stored for %s", str2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), a));
            try {
                Object objD = c2688aH1.getSerializer().d(bufferedReader, cls);
                bufferedReader.close();
                return objD;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c2688aH1.getLogger().c(NG1.ERROR, th3, "Error reading entity from scope cache: %s", str2);
            return null;
        }
    }

    public static <T> void d(@NotNull C2688aH1 c2688aH1, @NotNull T t, @NotNull String str, @NotNull String str2) {
        File fileB = b(c2688aH1, str);
        if (fileB == null) {
            c2688aH1.getLogger().a(NG1.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, a));
                try {
                    c2688aH1.getSerializer().b(t, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            c2688aH1.getLogger().c(NG1.ERROR, th5, "Error persisting entity: %s", str2);
        }
    }
}
