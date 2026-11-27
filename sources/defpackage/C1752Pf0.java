package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1752Pf0 implements InterfaceC6396rf0<Object> {
    public final /* synthetic */ InterfaceC6396rf0 d;
    public final /* synthetic */ AW1 e;

    /* JADX INFO: renamed from: Pf0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {123}, m = "collect")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;
        public C1830Qf0 h;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C1752Pf0.this.c(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1752Pf0(InterfaceC6396rf0 interfaceC6396rf0, Function2 function2) {
        this.d = interfaceC6396rf0;
        this.e = (AW1) function2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super Object> interfaceC6606sf0, @NotNull JM<? super Unit> jm) {
        a aVar;
        C1830Qf0 c1830Qf0;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object obj = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.e;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            InterfaceC6396rf0 interfaceC6396rf0 = this.d;
            C1830Qf0 c1830Qf1 = new C1830Qf0(interfaceC6606sf0, this.e);
            try {
                aVar.h = c1830Qf1;
                aVar.e = 1;
                if (interfaceC6396rf0.c(c1830Qf1, aVar) == mn) {
                    return mn;
                }
            } catch (C7306w e) {
                e = e;
                c1830Qf0 = c1830Qf1;
                if (e.d != c1830Qf0) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1830Qf0 = aVar.h;
            try {
                C1795Pt1.b(obj);
            } catch (C7306w e2) {
                e = e2;
                if (e.d != c1830Qf0) {
                    throw e;
                }
            }
        }
        return Unit.a;
    }
}
