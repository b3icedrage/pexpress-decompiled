package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5310mU1 implements InterfaceC6396rf0<List<? extends CF>> {
    public final /* synthetic */ InterfaceC6396rf0 d;
    public final /* synthetic */ List e;
    public final /* synthetic */ int g;

    /* JADX INFO: renamed from: mU1$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;
        public final /* synthetic */ List e;
        public final /* synthetic */ int g;

        /* JADX INFO: renamed from: mU1$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.graphic.usecases.SubscribeToValueUpdatesUseCaseBase$subscribeWithHistory$$inlined$map$1$2", f = "SubscribeToValueUpdatesUseCaseBase.kt", l = {219}, m = "emit")
        public static final class C0440a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0440a(JM jm) {
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

        public a(InterfaceC6606sf0 interfaceC6606sf0, List list, int i) {
            this.d = interfaceC6606sf0;
            this.e = list;
            this.g = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM jm) {
            C0440a c0440a;
            List list;
            if (jm instanceof C0440a) {
                c0440a = (C0440a) jm;
                int i = c0440a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0440a.e = i - Integer.MIN_VALUE;
                } else {
                    c0440a = new C0440a(jm);
                }
            } else {
                c0440a = new C0440a(jm);
            }
            Object obj2 = c0440a.d;
            MN mn = MN.d;
            int i2 = c0440a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                CF cf = (CF) obj;
                while (true) {
                    list = this.e;
                    if (list.size() <= this.g) {
                        break;
                    }
                    list.remove(0);
                }
                list.add(cf);
                List listE0 = CollectionsKt.e0(list);
                c0440a.e = 1;
                if (this.d.a(listE0, c0440a) == mn) {
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

    public C5310mU1(InterfaceC6396rf0 interfaceC6396rf0, List list, int i) {
        this.d = interfaceC6396rf0;
        this.e = list;
        this.g = i;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends CF>> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0, this.e, this.g), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
