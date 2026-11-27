package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: eI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3543eI1 extends ML0 implements Function0<InterfaceC4853kJ0> {
    public final /* synthetic */ List<SJ0> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3543eI1(List<? extends SJ0> list) {
        super(0);
        this.d = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC4853kJ0 invoke() {
        return this.d.get(0).g();
    }
}
