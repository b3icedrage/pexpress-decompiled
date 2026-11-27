package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6560sR1 implements InterfaceC6350rR1 {

    @NotNull
    public final InterfaceC4878kR1 a;

    @NotNull
    public final GP1 b;

    @NotNull
    public final C6610sg0 c;

    /* JADX INFO: renamed from: sR1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.strategyinstructions.providers.StrategyInstructionSelectionProviderBase$selectedStrategyInstruction$1", f = "StrategyInstructionSelectionProviderBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<Integer, List<? extends C3496e42>, JM<? super C3496e42>, Object> {
        public /* synthetic */ int d;
        public /* synthetic */ List e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return this.e.get(this.d);
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Integer num, List<? extends C3496e42> list, JM<? super C3496e42> jm) {
            int iIntValue = num.intValue();
            a aVar = new a(3, jm);
            aVar.d = iIntValue;
            aVar.e = list;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public C6560sR1(@NotNull InterfaceC4878kR1 strategiesProvider) {
        Intrinsics.checkNotNullParameter(strategiesProvider, "strategiesProvider");
        this.a = strategiesProvider;
        GP1 gp1I = C1589Ne.i(0);
        this.b = gp1I;
        this.c = new C6610sg0(gp1I, strategiesProvider.b(), new a(3, null));
    }

    @Override // defpackage.InterfaceC6350rR1
    public final void a(@NotNull C3496e42 newStrategyUi) {
        Intrinsics.checkNotNullParameter(newStrategyUi, "newStrategyUi");
        Iterator it = ((List) this.a.a().d.getValue()).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C3496e42) it.next()).a == newStrategyUi.a) {
                Integer numValueOf = Integer.valueOf(i);
                GP1 gp1 = this.b;
                gp1.getClass();
                gp1.m(null, numValueOf);
            }
            i++;
        }
        i = -1;
        Integer numValueOf2 = Integer.valueOf(i);
        GP1 gp2 = this.b;
        gp2.getClass();
        gp2.m(null, numValueOf2);
    }

    @Override // defpackage.InterfaceC6350rR1
    @NotNull
    public final C6610sg0 b() {
        return this.c;
    }
}
