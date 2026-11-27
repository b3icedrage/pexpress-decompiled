package defpackage;

import io.sentry.android.core.b0;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: iP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4402iP {
    public final String a;
    public final C4448id0 b;

    public C4402iP(String str, C4448id0 c4448id0) {
        this.a = str;
        this.b = c4448id0;
    }

    public final void a() {
        String str = this.a;
        try {
            C4448id0 c4448id0 = this.b;
            c4448id0.getClass();
            new File(c4448id0.b, str).createNewFile();
        } catch (IOException e) {
            b0.d("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }
}
