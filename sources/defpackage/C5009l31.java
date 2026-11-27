package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.instrumentation.file.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5009l31 {

    @NonNull
    public final C7175vM1 a;

    public C5009l31(@NonNull C7175vM1 c7175vM1) {
        this.a = c7175vM1;
    }

    public static String a(String str, EnumC1665Oc0 enumC1665Oc0, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        String strConcat = enumC1665Oc0.d;
        if (z) {
            strConcat = ".temp".concat(strConcat);
        }
        sb.append(strConcat);
        return sb.toString();
    }

    public final File b() {
        File file = new File(((Context) this.a.d).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File c(String str, InputStream inputStream, EnumC1665Oc0 enumC1665Oc0) {
        File file = new File(b(), a(str, enumC1665Oc0, true));
        try {
            FileOutputStream fileOutputStreamB = j.a.b(new FileOutputStream(file), file);
            try {
                byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStreamB.flush();
                        fileOutputStreamB.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStreamB.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStreamB.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }
}
