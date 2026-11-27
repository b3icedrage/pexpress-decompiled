package defpackage;

import android.content.Context;
import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Jb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1270Jb0 implements InterfaceC1192Ib0 {

    @NotNull
    public final C6610sg0 a;

    /* JADX INFO: renamed from: Jb0$a */
    @InterfaceC3368dU(c = "com.base.feature.support.support.providers.FaqItemsProviderBase$faqItems$1", f = "FaqItemsProviderBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<List<? extends C1114Hb0>, Boolean, JM<? super List<? extends C1114Hb0>>, Object> {
        public /* synthetic */ List d;
        public /* synthetic */ boolean e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            List list = this.d;
            if (!this.e) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((C1114Hb0) obj2).b != R.string.how_to_activate_my_acc_title) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(List<? extends C1114Hb0> list, Boolean bool, JM<? super List<? extends C1114Hb0>> jm) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(3, jm);
            aVar.d = list;
            aVar.e = zBooleanValue;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: Jb0$b */
    public static final class b implements InterfaceC6396rf0<List<? extends C1114Hb0>> {
        public final /* synthetic */ C4250hg0 d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ InterfaceC3170cY g;

        /* JADX INFO: renamed from: Jb0$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ Context e;
            public final /* synthetic */ InterfaceC3170cY g;

            /* JADX INFO: renamed from: Jb0$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.support.providers.FaqItemsProviderBase$special$$inlined$map$1$2", f = "FaqItemsProviderBase.kt", l = {332, 219}, m = "emit")
            public static final class C0065a extends LM {
                public /* synthetic */ Object d;
                public int e;
                public InterfaceC6606sf0 g;
                public CQ0 i;
                public C1114Hb0[] j;
                public InterfaceC3170cY k;
                public EnumC1036Gb0 l;
                public C1114Hb0[] m;
                public CQ0 n;
                public int o;
                public int p;
                public int q;
                public int r;

                public C0065a(JM jm) {
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

            public a(InterfaceC6606sf0 interfaceC6606sf0, Context context, InterfaceC3170cY interfaceC3170cY) {
                this.d = interfaceC6606sf0;
                this.e = context;
                this.g = interfaceC3170cY;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0258, code lost:
            
                if (r6.a(r1, r2) == r3) goto L22;
             */
            @Override // defpackage.InterfaceC6606sf0
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r23, @org.jetbrains.annotations.NotNull defpackage.JM r24) {
                /*
                    Method dump skipped, instruction units count: 606
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C1270Jb0.b.a.a(java.lang.Object, JM):java.lang.Object");
            }
        }

        public b(C4250hg0 c4250hg0, Context context, InterfaceC3170cY interfaceC3170cY) {
            this.d = c4250hg0;
            this.e = context;
            this.g = interfaceC3170cY;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends C1114Hb0>> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0, this.e, this.g), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C1270Jb0(@NotNull Context context, @NotNull C4923kf appData, @NotNull InterfaceC3170cY depositValuesProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(depositValuesProvider, "depositValuesProvider");
        this.a = new C6610sg0(new b(new C4250hg0(appData.k, 0), context, depositValuesProvider), appData.e, new a(3, null));
    }

    @Override // defpackage.InterfaceC1192Ib0
    @NotNull
    public final C6610sg0 a() {
        return this.a;
    }
}
