package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C6049q00;
import defpackage.C7880yi1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NonNull
    public final Executor a;

    @NonNull
    public final c.InterfaceC0237c b;
    public final byte[] c;

    @NonNull
    public final File d;

    @NonNull
    public final String e;
    public boolean f = false;
    public C6049q00[] g;
    public byte[] h;

    public b(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull c.InterfaceC0237c interfaceC0237c, @NonNull String str, @NonNull File file) {
        this.a = executor;
        this.b = interfaceC0237c;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                    bArr = C7880yi1.e;
                    break;
                case 26:
                    bArr = C7880yi1.d;
                    break;
                case 27:
                    bArr = C7880yi1.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = C7880yi1.b;
                    break;
                case 31:
                case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                case 33:
                case 34:
                    bArr = C7880yi1.a;
                    break;
            }
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: m00
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b.a(i, serializable);
            }
        });
    }
}
