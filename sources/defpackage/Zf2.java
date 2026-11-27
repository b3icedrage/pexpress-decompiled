package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class Zf2 implements Tf2 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final AbstractC5328ma1 b;

    @NotNull
    public final ArrayList c;

    @NotNull
    public final ConcurrentHashMap<String, String> d;

    @Nullable
    public String e;

    public static final class a implements InterfaceC6396rf0<List<? extends C5686oG>> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: Zf2$a$a, reason: collision with other inner class name */
        public static final class C0206a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: Zf2$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.core.backend.WebSocketBestSelectorBase$fullServerList$$inlined$map$1$2", f = "WebSocketBestSelectorBase.kt", l = {219}, m = "emit")
            public static final class C0207a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0207a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0206a.this.a(null, this);
                }
            }

            public C0206a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0207a c0207a;
                if (jm instanceof C0207a) {
                    c0207a = (C0207a) jm;
                    int i = c0207a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0207a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0207a = new C0207a(jm);
                    }
                } else {
                    c0207a = new C0207a(jm);
                }
                Object obj2 = c0207a.d;
                MN mn = MN.d;
                int i2 = c0207a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    FF ff = (FF) obj;
                    Object obj3 = ff != null ? ff.q : null;
                    c0207a.e = 1;
                    if (this.d.a(obj3, c0207a) == mn) {
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

        public a(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends C5686oG>> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new C0206a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    public Zf2(@NotNull C4923kf appDataRepository, @NotNull AbstractC5328ma1 originProvider) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(originProvider, "originProvider");
        this.a = appDataRepository;
        this.b = originProvider;
        this.c = new ArrayList();
        this.d = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
    
        if (r1 == r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(defpackage.Zf2 r20, defpackage.LM r21) {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Zf2.e(Zf2, LM):java.lang.Object");
    }

    @Override // defpackage.Tf2
    @Nullable
    public final Object a(@NotNull Jg2 jg2) {
        return e(this, jg2);
    }

    @Override // defpackage.Tf2
    @NotNull
    public final String b() {
        String str = this.e;
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(LM lm) {
        Yf2 yf2;
        Zf2 zf2;
        if (lm instanceof Yf2) {
            yf2 = (Yf2) lm;
            int i = yf2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                yf2.h = i - Integer.MIN_VALUE;
            } else {
                yf2 = new Yf2(this, lm);
            }
        } else {
            yf2 = new Yf2(this, lm);
        }
        Object objA = yf2.e;
        MN mn = MN.d;
        int i2 = yf2.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            InterfaceC6396rf0<List<C5686oG>> interfaceC6396rf0D = d();
            yf2.d = this;
            yf2.h = 1;
            objA = C7236vf0.a(interfaceC6396rf0D, yf2);
            if (objA == mn) {
                return mn;
            }
            zf2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zf2 = yf2.d;
            C1795Pt1.b(objA);
        }
        List list = (List) objA;
        list.toString();
        zf2.c.clear();
        zf2.d.clear();
        ArrayList arrayList = zf2.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C5686oG) it.next()).c = null;
        }
        arrayList.addAll(list);
        return Unit.a;
    }

    @NotNull
    public InterfaceC6396rf0<List<C5686oG>> d() {
        return new a(this.a.b);
    }
}
