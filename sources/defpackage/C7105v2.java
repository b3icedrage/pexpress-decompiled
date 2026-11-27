package defpackage;

import android.content.Context;
import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7105v2 implements InterfaceC7295vw0 {

    @NotNull
    public final InterfaceC3170cY a;

    @NotNull
    public final List<C6911u6> b;

    @NotNull
    public final a c;

    /* JADX INFO: renamed from: v2$a */
    public static final class a implements InterfaceC6396rf0<List<? extends C6911u6>> {
        public final /* synthetic */ C4250hg0 d;
        public final /* synthetic */ C7105v2 e;

        /* JADX INFO: renamed from: v2$a$a, reason: collision with other inner class name */
        public static final class C0509a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ C7105v2 e;

            /* JADX INFO: renamed from: v2$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.feature.account.models.AccountActivationStepsProvider$special$$inlined$map$1$2", f = "AccountActivationStepsProvider.kt", l = {229, 219}, m = "emit")
            public static final class C0510a extends LM {
                public /* synthetic */ Object d;
                public int e;
                public C0509a g;
                public InterfaceC6606sf0 i;
                public Collection j;
                public Iterator k;
                public Collection l;
                public InterfaceC3170cY m;
                public C6911u6 n;
                public int o;

                public C0510a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0509a.this.a(null, this);
                }
            }

            public C0509a(InterfaceC6606sf0 interfaceC6606sf0, C7105v2 c7105v2) {
                this.d = interfaceC6606sf0;
                this.e = c7105v2;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0077  */
            /* JADX WARN: Code duplicated, block: B:21:0x007f  */
            /* JADX WARN: Code duplicated, block: B:23:0x0083  */
            /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a4 -> B:27:0x00aa). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f5 -> B:29:0x00f7). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.InterfaceC6606sf0
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object a(java.lang.Object r25, @org.jetbrains.annotations.NotNull defpackage.JM r26) {
                /*
                    Method dump skipped, instruction units count: 290
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C7105v2.a.C0509a.a(java.lang.Object, JM):java.lang.Object");
            }
        }

        public a(C4250hg0 c4250hg0, C7105v2 c7105v2) {
            this.d = c4250hg0;
            this.e = c7105v2;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends C6911u6>> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0509a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C7105v2(@NotNull Context context, @NotNull C4923kf appDataRepository, @NotNull InterfaceC3170cY depositValuesProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(depositValuesProvider, "depositValuesProvider");
        this.a = depositValuesProvider;
        List listC = VE.c(Integer.valueOf(R.string.app_name));
        double dH = C7644xc.h(23);
        Intrinsics.checkNotNullParameter(context, "context");
        C6911u6 c6911u6 = new C6911u6(R.string.create_an_account_platform_tittle, listC, "1/3", dH, N7.C(180, context), "https://assets.pbotservices.com/images/activate_account.png", R.string.create_new_account_button, 4);
        double dH2 = C7644xc.h(67);
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = WE.f(c6911u6, new C6911u6(R.string.activation_banner_make_deposit_title, (List) null, "2/3", dH2, N7.C(120, context), "https://assets.pbotservices.com/images/deposit.png", R.string.Top_up_your_account, 6));
        this.c = new a(new C4250hg0(appDataRepository.b, 0), this);
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final C1021Fw0 f() {
        List<C6911u6> list = this.b;
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6911u6) it.next()).g);
        }
        return new C1021Fw0(arrayList, null, 2);
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final EnumC7035uh1 getPriority() {
        return EnumC7035uh1.h;
    }
}
