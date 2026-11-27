package defpackage;

import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* JADX INFO: renamed from: jm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4744jm2 extends IntegrityTokenResponse {
    public final String a;

    public C4744jm2(String str) {
        this.a = str;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.a;
    }
}
