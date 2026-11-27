package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Bi2 implements ZI1 {

    @NotNull
    public final EnumC2694aJ1 a;

    @NotNull
    public final InterfaceC6396rf0<Set<String>> b;

    @NotNull
    public final C6610sg0 c;

    @InterfaceC3368dU(c = "com.base.feature.support.chat.data.WhetherUserStartedDemoSessionValue$valueFlow$1", f = "WhetherUserStartedDemoSessionValue.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<C6945uG, Set<? extends String>, JM<? super Boolean>, Object> {
        public /* synthetic */ C6945uG d;
        public /* synthetic */ Set e;

        public a(JM<? super a> jm) {
            super(3, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C6945uG c6945uG = this.d;
            Set set = this.e;
            String string = c6945uG != null ? new Long(c6945uG.a).toString() : null;
            Bi2.this.getClass();
            return Boolean.valueOf(string != null && set.contains(string));
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(C6945uG c6945uG, Set<? extends String> set, JM<? super Boolean> jm) {
            a aVar = Bi2.this.new a(jm);
            aVar.d = c6945uG;
            aVar.e = set;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public Bi2(@NotNull C4923kf appData, @NotNull AbstractC6764tP1 startedDemoTradingIdsUseCase) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(startedDemoTradingIdsUseCase, "startedDemoTradingIdsUseCase");
        this.a = EnumC2694aJ1.DID_USER_START_DEMO_TRADING_KEY;
        GP1 gp1 = appData.k;
        InterfaceC6396rf0 interfaceC6396rf0L = startedDemoTradingIdsUseCase.l();
        this.b = interfaceC6396rf0L;
        this.c = new C6610sg0(gp1, interfaceC6396rf0L, new a(null));
    }

    @Override // defpackage.ZI1
    @Nullable
    public final Object a(@NotNull TA ta, @NotNull XA.d dVar) {
        Object objC = ((C6610sg0) b()).c(new YI1(ta, this), dVar);
        MN mn = MN.d;
        if (objC != mn) {
            objC = Unit.a;
        }
        return objC == mn ? objC : Unit.a;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final InterfaceC6396rf0<Boolean> b() {
        return this.c;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final EnumC2694aJ1 getKey() {
        return this.a;
    }
}
