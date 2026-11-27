package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Ik1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1220Ik1 implements Uc2 {
    public boolean a = false;
    public boolean b = false;
    public C6175qc0 c;
    public final C0986Fk1 d;

    public C1220Ik1(C0986Fk1 c0986Fk1) {
        this.d = c0986Fk1;
    }

    @Override // defpackage.Uc2
    @NonNull
    public final Uc2 b(String str) {
        if (this.a) {
            throw new I60("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.Uc2
    @NonNull
    public final Uc2 c(boolean z) {
        if (this.a) {
            throw new I60("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.b(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
