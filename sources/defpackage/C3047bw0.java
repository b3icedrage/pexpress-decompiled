package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.stats.CodePackage;
import io.sentry.android.core.b0;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: renamed from: bw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3047bw0 {
    public static final String[] c = {"*", "FCM", CodePackage.GCM, ""};
    public final SharedPreferences a;
    public final String b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public C3047bw0(@NonNull C1198Id0 c1198Id0) {
        c1198Id0.a();
        this.a = c1198Id0.a.getSharedPreferences("com.google.android.gms.appid", 0);
        c1198Id0.a();
        C3193ce0 c3193ce0 = c1198Id0.c;
        String str = c3193ce0.e;
        if (str == null) {
            c1198Id0.a();
            str = c3193ce0.b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.b = str;
    }

    public final String a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.a) {
            String strEncodeToString = null;
            String string = this.a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                b0.e("ContentValues", "Invalid key stored " + e);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                b0.e("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}
