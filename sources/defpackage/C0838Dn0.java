package defpackage;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Dn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0838Dn0 extends ML0 implements Function0<List<? extends Certificate>> {
    public final /* synthetic */ List<Certificate> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0838Dn0(List<? extends Certificate> list) {
        super(0);
        this.d = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Certificate> invoke() {
        return this.d;
    }
}
