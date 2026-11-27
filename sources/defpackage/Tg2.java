package defpackage;

import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Tg2 implements InterfaceC6396rf0<ResultOk<Object>> {
    public final /* synthetic */ InterfaceC6396rf0 d;

    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;

        /* JADX INFO: renamed from: Tg2$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase$subscribeRaw$$inlined$map$1$2", f = "WebSocketRequestExecutorBase.kt", l = {219}, m = "emit")
        public static final class C0147a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0147a(JM jm) {
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
            C0147a c0147a;
            if (jm instanceof C0147a) {
                c0147a = (C0147a) jm;
                int i = c0147a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0147a.e = i - Integer.MIN_VALUE;
                } else {
                    c0147a = new C0147a(jm);
                }
            } else {
                c0147a = new C0147a(jm);
            }
            Object obj2 = c0147a.d;
            MN mn = MN.d;
            int i2 = c0147a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                ResultOk resultOk = new ResultOk(obj);
                c0147a.e = 1;
                if (this.d.a(resultOk, c0147a) == mn) {
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

    public Tg2(InterfaceC6396rf0 interfaceC6396rf0) {
        this.d = interfaceC6396rf0;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super ResultOk<Object>> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
