package defpackage;

import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5097lU1 implements InterfaceC6396rf0<List<? extends CF>> {
    public final /* synthetic */ C5310mU1 d;
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: lU1$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;
        public final /* synthetic */ int e;

        /* JADX INFO: renamed from: lU1$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.graphic.usecases.SubscribeToValueUpdatesUseCaseBase$subscribeWithHistory$$inlined$filter$1$2", f = "SubscribeToValueUpdatesUseCaseBase.kt", l = {219}, m = "emit")
        public static final class C0436a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0436a(JM jm) {
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

        public a(InterfaceC6606sf0 interfaceC6606sf0, int i) {
            this.d = interfaceC6606sf0;
            this.e = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM jm) {
            C0436a c0436a;
            if (jm instanceof C0436a) {
                c0436a = (C0436a) jm;
                int i = c0436a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0436a.e = i - Integer.MIN_VALUE;
                } else {
                    c0436a = new C0436a(jm);
                }
            } else {
                c0436a = new C0436a(jm);
            }
            Object obj2 = c0436a.d;
            MN mn = MN.d;
            int i2 = c0436a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                if (((List) obj).size() >= this.e) {
                    c0436a.e = 1;
                    if (this.d.a(obj, c0436a) == mn) {
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

    public C5097lU1(C5310mU1 c5310mU1, int i) {
        this.d = c5310mU1;
        this.e = i;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends CF>> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0, this.e), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
