package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Pg2 implements InterfaceC6396rf0<EnumC3495e41> {
    public final /* synthetic */ GP1 d;

    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;

        /* JADX INFO: renamed from: Pg2$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase$special$$inlined$filter$1$2", f = "WebSocketRequestExecutorBase.kt", l = {219}, m = "emit")
        public static final class C0117a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0117a(JM jm) {
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
            C0117a c0117a;
            if (jm instanceof C0117a) {
                c0117a = (C0117a) jm;
                int i = c0117a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0117a.e = i - Integer.MIN_VALUE;
                } else {
                    c0117a = new C0117a(jm);
                }
            } else {
                c0117a = new C0117a(jm);
            }
            Object obj2 = c0117a.d;
            MN mn = MN.d;
            int i2 = c0117a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                EnumC3495e41[] elements = {EnumC3495e41.h, EnumC3495e41.g, EnumC3495e41.i};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (CollectionsKt.z(C1526Mj.H(elements), (EnumC3495e41) obj)) {
                    c0117a.e = 1;
                    if (this.d.a(obj, c0117a) == mn) {
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

    public Pg2(GP1 gp1) {
        this.d = gp1;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super EnumC3495e41> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
        this.d.c(new a(interfaceC6606sf0), jm);
        return MN.d;
    }
}
