package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.ResultError;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Qg2 implements InterfaceC6396rf0<ResultError> {
    public final /* synthetic */ Pg2 d;

    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;

        /* JADX INFO: renamed from: Qg2$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase$special$$inlined$map$1$2", f = "WebSocketRequestExecutorBase.kt", l = {219}, m = "emit")
        public static final class C0132a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0132a(JM jm) {
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
            C0132a c0132a;
            if (jm instanceof C0132a) {
                c0132a = (C0132a) jm;
                int i = c0132a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0132a.e = i - Integer.MIN_VALUE;
                } else {
                    c0132a = new C0132a(jm);
                }
            } else {
                c0132a = new C0132a(jm);
            }
            Object obj2 = c0132a.d;
            MN mn = MN.d;
            int i2 = c0132a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                ResultError resultError = new ResultError(new CommonError.NotWebSocketConnection());
                c0132a.e = 1;
                if (this.d.a(resultError, c0132a) == mn) {
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

    public Qg2(Pg2 pg2) {
        this.d = pg2;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super ResultError> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
        Object objC = this.d.c(new a(interfaceC6606sf0), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
