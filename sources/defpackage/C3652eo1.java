package defpackage;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3652eo1 extends ML0 implements Function0<List<? extends Certificate>> {
    public final /* synthetic */ C6044pz d;
    public final /* synthetic */ C0916En0 e;
    public final /* synthetic */ C5450n8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3652eo1(C6044pz c6044pz, C0916En0 c0916En0, C5450n8 c5450n8) {
        super(0);
        this.d = c6044pz;
        this.e = c0916En0;
        this.g = c5450n8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Certificate> invoke() {
        G1 g1 = this.d.b;
        Intrinsics.checkNotNull(g1);
        return g1.d(this.g.h.d, this.e.a());
    }
}
