package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResultKt$okFilter$$inlined$filterIsInstance$1;
import kotlin.Unit;

/* JADX INFO: renamed from: rO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6339rO implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InterfaceC6396rf0 e;
    public final /* synthetic */ Object g;

    public /* synthetic */ C6339rO(InterfaceC6396rf0 interfaceC6396rf0, Object obj, int i) {
        this.d = i;
        this.e = interfaceC6396rf0;
        this.g = obj;
    }

    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) {
        switch (this.d) {
            case 0:
                Object objC = this.e.c(new C6130qO(interfaceC6606sf0, (C5077lO) this.g), jm);
                return objC == MN.d ? objC : Unit.a;
            case 1:
                Object objC2 = ((CommonResultKt$okFilter$$inlined$filterIsInstance$1) this.e).c(new C1986Sf0(interfaceC6606sf0, (R22) this.g), jm);
                return objC2 == MN.d ? objC2 : Unit.a;
            default:
                Object objC3 = ((C6759tO) this.e).c(new C4419iU1(interfaceC6606sf0, (String) this.g), jm);
                return objC3 == MN.d ? objC3 : Unit.a;
        }
    }
}
