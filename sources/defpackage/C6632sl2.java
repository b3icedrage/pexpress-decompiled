package defpackage;

import com.google.gson.JsonElement;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6632sl2 implements InterfaceC6396rf0<JsonElement> {
    public final /* synthetic */ C6422rl2 d;

    /* JADX INFO: renamed from: sl2$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;

        /* JADX INFO: renamed from: sl2$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.impl.core.backend.utils.WsApiUtilsKt$getRightMessages$$inlined$map$1$2", f = "WsApiUtils.kt", l = {219}, m = "emit")
        public static final class C0488a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0488a(JM jm) {
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
            C0488a c0488a;
            if (jm instanceof C0488a) {
                c0488a = (C0488a) jm;
                int i = c0488a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0488a.e = i - Integer.MIN_VALUE;
                } else {
                    c0488a = new C0488a(jm);
                }
            } else {
                c0488a = new C0488a(jm);
            }
            Object obj2 = c0488a.d;
            MN mn = MN.d;
            int i2 = c0488a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                T t = ((C0919Eo0) obj).b;
                c0488a.e = 1;
                if (this.d.a(t, c0488a) == mn) {
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

    public C6632sl2(C6422rl2 c6422rl2) {
        this.d = c6422rl2;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super JsonElement> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
