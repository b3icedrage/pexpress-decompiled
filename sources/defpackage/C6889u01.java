package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

/* JADX INFO: renamed from: u01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6889u01 {
    public static final SecureRandom a = new SecureRandom();

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read();
            if (i != -1) {
                if (i == 10) {
                    break;
                }
                if (i != 13) {
                    byteArrayOutputStream.write(i);
                } else {
                    int i2 = inputStream.read();
                    if (i2 == -1) {
                        byteArrayOutputStream.write(i);
                        break;
                    }
                    if (i2 == 10) {
                        break;
                    }
                    byteArrayOutputStream.write(i);
                    byteArrayOutputStream.write(i2);
                }
            } else {
                if (byteArrayOutputStream.size() != 0) {
                    break;
                }
                return null;
            }
        }
        return byteArrayOutputStream.toString("UTF-8");
    }
}
