package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6860tr0 {

    @NotNull
    public static final d b = new d();

    @NotNull
    public static final C2498Yk<C6860tr0> c = new C2498Yk<>("HttpSend");

    @NotNull
    public final ArrayList a = new ArrayList();

    /* JADX INFO: renamed from: tr0$a */
    public static final class a {
    }

    /* JADX INFO: renamed from: tr0$b */
    public static final class b implements JF1 {

        @NotNull
        public final C1782Pp0 a;
        public int b;

        @Nullable
        public C2250Vp0 c;

        public b(@NotNull C1782Pp0 client) {
            Intrinsics.checkNotNullParameter(client, "client");
            this.a = client;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.JF1
        @Nullable
        public final Object a(@NotNull C3032br0 c3032br0, @NotNull LM lm) {
            C7070ur0 c7070ur0;
            b bVar;
            if (lm instanceof C7070ur0) {
                c7070ur0 = (C7070ur0) lm;
                int i = c7070ur0.h;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c7070ur0.h = i - Integer.MIN_VALUE;
                } else {
                    c7070ur0 = new C7070ur0(this, lm);
                }
            } else {
                c7070ur0 = new C7070ur0(this, lm);
            }
            Object objA = c7070ur0.e;
            MN mn = MN.d;
            int i2 = c7070ur0.h;
            if (i2 == 0) {
                C1795Pt1.b(objA);
                C2250Vp0 c2250Vp0 = this.c;
                if (c2250Vp0 != null) {
                    LN.c(c2250Vp0, null);
                }
                int i3 = this.b;
                if (i3 >= 20) {
                    Intrinsics.checkNotNullParameter("Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required.", "message");
                    throw new C7575xF1("Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required.");
                }
                this.b = i3 + 1;
                C7491wr0 c7491wr0 = this.a.k;
                Object obj = c3032br0.d;
                c7070ur0.d = this;
                c7070ur0.h = 1;
                objA = c7491wr0.a(c3032br0, obj, c7070ur0);
                if (objA == mn) {
                    return mn;
                }
                bVar = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = c7070ur0.d;
                C1795Pt1.b(objA);
            }
            C2250Vp0 c2250Vp1 = objA instanceof C2250Vp0 ? (C2250Vp0) objA : null;
            if (c2250Vp1 != null) {
                bVar.c = c2250Vp1;
                return c2250Vp1;
            }
            throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + objA).toString());
        }
    }

    /* JADX INFO: renamed from: tr0$c */
    public static final class c implements JF1 {

        @NotNull
        public final InterfaceC1060Gj0<JF1, C3032br0, JM<? super C2250Vp0>, Object> a;

        @NotNull
        public final JF1 b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull InterfaceC1060Gj0<? super JF1, ? super C3032br0, ? super JM<? super C2250Vp0>, ? extends Object> interceptor, @NotNull JF1 nextSender) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            Intrinsics.checkNotNullParameter(nextSender, "nextSender");
            this.a = interceptor;
            this.b = nextSender;
        }

        @Override // defpackage.JF1
        @Nullable
        public final Object a(@NotNull C3032br0 c3032br0, @NotNull LM lm) {
            return this.a.k(this.b, c3032br0, lm);
        }
    }

    /* JADX INFO: renamed from: tr0$d */
    public static final class d implements InterfaceC4755jq0<a, C6860tr0> {
        @Override // defpackage.InterfaceC4755jq0
        public final void a(C6860tr0 c6860tr0, C1782Pp0 scope) {
            C6860tr0 plugin = c6860tr0;
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.i.f(C4539ir0.j, new C7280vr0(plugin, scope, null));
        }

        @Override // defpackage.InterfaceC4755jq0
        public final C6860tr0 b(Function1<? super a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            block.invoke(new a());
            return new C6860tr0();
        }

        @Override // defpackage.InterfaceC4755jq0
        @NotNull
        public final C2498Yk<C6860tr0> getKey() {
            return C6860tr0.c;
        }
    }
}
