package io.sentry.android.core;

import android.content.Context;
import defpackage.C2432Xo;
import io.sentry.util.C4527a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class N {

    @Nullable
    public static String a;
    public static final Charset b = Charset.forName("UTF-8");

    @NotNull
    public static final C4527a c = new C4527a();

    public static String a(@NotNull Context context) {
        C4527a.C0404a c0404aA = c.a();
        try {
            if (a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    boolean zExists = file.exists();
                    Charset charset = b;
                    if (!zExists) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String strH = C2432Xo.h();
                            fileOutputStream.write(strH.getBytes(charset));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            a = strH;
                            c0404aA.close();
                            return strH;
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, charset);
                        randomAccessFile.close();
                        a = str;
                    } catch (Throwable th3) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    throw new RuntimeException(th5);
                }
            }
            String str2 = a;
            c0404aA.close();
            return str2;
        } catch (Throwable th6) {
            try {
                c0404aA.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }
}
