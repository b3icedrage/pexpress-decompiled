package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResultKt$okFilter$$inlined$filterIsInstance$1;
import kotlin.Unit;

/* JADX INFO: renamed from: tO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6759tO implements InterfaceC6396rf0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InterfaceC6396rf0 e;

    public /* synthetic */ C6759tO(InterfaceC6396rf0 interfaceC6396rf0, int i) {
        this.d = i;
        this.e = interfaceC6396rf0;
    }

    @Override // defpackage.InterfaceC6396rf0
    public final Object c(InterfaceC6606sf0 interfaceC6606sf0, JM jm) {
        switch (this.d) {
            case 0:
                Object objC = ((C4250hg0) this.e).c(new C6549sO(interfaceC6606sf0), jm);
                return objC == MN.d ? objC : Unit.a;
            case 1:
                Object objC2 = ((C6339rO) this.e).c(new C2064Tf0(interfaceC6606sf0), jm);
                return objC2 == MN.d ? objC2 : Unit.a;
            default:
                Object objC3 = ((CommonResultKt$okFilter$$inlined$filterIsInstance$1) this.e).c(new C4677jU1(interfaceC6606sf0), jm);
                return objC3 == MN.d ? objC3 : Unit.a;
        }
    }
}
