package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: j00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4576j00 {
    public final Context a;
    public a b = null;

    /* JADX INFO: renamed from: j00$a */
    public class a {
        public final String a;
        public final String b;

        public a(C4576j00 c4576j00) {
            int iD = C7155vG.d(c4576j00.a, "com.google.firebase.crashlytics.unity_version", "string");
            Context context = c4576j00.a;
            if (iD != 0) {
                this.a = "Unity";
                this.b = context.getResources().getString(iD);
                Log.isLoggable("FirebaseCrashlytics", 2);
                return;
            }
            if (context.getAssets() != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    this.a = "Flutter";
                    this.b = null;
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    return;
                } catch (IOException unused) {
                }
            }
            this.a = null;
            this.b = null;
        }
    }

    public C4576j00(Context context) {
        this.a = context;
    }
}
