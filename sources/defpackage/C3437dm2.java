package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: renamed from: dm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3437dm2 {
    public final C7266vm2 a;
    public final String b;
    public final LE c;
    public final Xl2 d;

    public C3437dm2(Context context, C7266vm2 c7266vm2, LE le) {
        String strEncodeToString;
        this.b = context.getPackageName();
        this.a = c7266vm2;
        this.c = le;
        C7266vm2 c7266vm3 = C2794am2.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            strEncodeToString = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                            String str = Build.TAGS;
                            if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                            }
                        }
                        this.d = new Xl2(context, c7266vm2, C3856fm2.a);
                        return;
                    }
                }
                Object[] objArr = new Object[0];
                C7266vm2 c7266vm4 = C2794am2.a;
                c7266vm4.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    C7266vm2.b(c7266vm4.a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        c7266vm2.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", C7266vm2.b(c7266vm2.a, "Phonesky is not installed.", objArr2));
        }
        this.d = null;
    }

    public static Bundle a(C3437dm2 c3437dm2, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c3437dm2.b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList<AbstractC6217qm2> arrayList = new ArrayList();
        arrayList.add(new C6007pm2(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC6217qm2 abstractC6217qm2 : arrayList) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", abstractC6217qm2.a());
            bundle2.putLong("event_timestamp", abstractC6217qm2.b());
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
