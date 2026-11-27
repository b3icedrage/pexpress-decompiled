package defpackage;

import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.impl.core.backend.modelsResponse.BetClosedResponseImpl;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Q22 implements InterfaceC6396rf0<ResultOk<? extends BetClosedResponseImpl.ClosedBetImpl>> {
    public final /* synthetic */ C6759tO d;

    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;

        /* JADX INFO: renamed from: Q22$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.impl.core.backend.data_sources.TradingDataSourceImpl$separateCloseResponses$$inlined$map$1$2", f = "TradingDataSourceImpl.kt", l = {219}, m = "emit")
        public static final class C0128a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0128a(JM jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.e |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(InterfaceC6606sf0 interfaceC6606sf0) {
            this.d = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM jm) {
            C0128a c0128a;
            if (jm instanceof C0128a) {
                c0128a = (C0128a) jm;
                int i = c0128a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0128a.e = i - Integer.MIN_VALUE;
                } else {
                    c0128a = new C0128a(jm);
                }
            } else {
                c0128a = new C0128a(jm);
            }
            Object obj2 = c0128a.d;
            MN mn = MN.d;
            int i2 = c0128a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                ResultOk resultOk = new ResultOk((BetClosedResponseImpl.ClosedBetImpl) obj);
                c0128a.e = 1;
                if (this.d.a(resultOk, c0128a) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj2);
            }
            return Unit.a;
        }
    }

    public Q22(C6759tO c6759tO) {
        this.d = c6759tO;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super ResultOk<? extends BetClosedResponseImpl.ClosedBetImpl>> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
