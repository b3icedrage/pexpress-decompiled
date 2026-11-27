package defpackage;

import com.api.core.backend.domain.models.abstractModels.WebSocketResponseAbstract;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Rg2 implements InterfaceC6396rf0<Object> {
    public final /* synthetic */ C3098cA d;
    public final /* synthetic */ Fg2 e;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;

    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;
        public final /* synthetic */ Fg2 e;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX INFO: renamed from: Rg2$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase$subscribe$$inlined$filter$1$2", f = "WebSocketRequestExecutorBase.kt", l = {219}, m = "emit")
        public static final class C0138a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0138a(JM jm) {
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

        public a(InterfaceC6606sf0 interfaceC6606sf0, Fg2 fg2, String str, String str2, String str3, String str4) {
            this.d = interfaceC6606sf0;
            this.e = fg2;
            this.g = str;
            this.h = str2;
            this.i = str3;
            this.j = str4;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM jm) {
            C0138a c0138a;
            if (jm instanceof C0138a) {
                c0138a = (C0138a) jm;
                int i = c0138a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0138a.e = i - Integer.MIN_VALUE;
                } else {
                    c0138a = new C0138a(jm);
                }
            } else {
                c0138a = new C0138a(jm);
            }
            Object obj2 = c0138a.d;
            MN mn = MN.d;
            int i2 = c0138a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                this.e.getClass();
                if (Fg2.p((WebSocketResponseAbstract) obj, this.g, this.h, this.i, this.j)) {
                    c0138a.e = 1;
                    if (this.d.a(obj, c0138a) == mn) {
                        return mn;
                    }
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

    public Rg2(C3098cA c3098cA, Fg2 fg2, String str, String str2, String str3, String str4) {
        this.d = c3098cA;
        this.e = fg2;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super Object> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0, this.e, this.g, this.h, this.i, this.j), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
