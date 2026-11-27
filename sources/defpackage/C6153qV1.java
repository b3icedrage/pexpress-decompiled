package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.support.support.screens.faq.SupportFaqPartBase;
import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.faq.SupportFaqPartBase$initFlowCollectors$$inlined$launchAndCollectIn$1", f = "SupportFaqPartBase.kt", l = {48}, m = "invokeSuspend")
public final class C6153qV1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ SupportFaqPartBase h;

    /* JADX INFO: renamed from: qV1$a */
    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.faq.SupportFaqPartBase$initFlowCollectors$$inlined$launchAndCollectIn$1$1", f = "SupportFaqPartBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ SupportFaqPartBase h;

        /* JADX INFO: renamed from: qV1$a$a, reason: collision with other inner class name */
        public static final class C0476a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ SupportFaqPartBase e;

            public C0476a(KN kn, SupportFaqPartBase supportFaqPartBase) {
                this.e = supportFaqPartBase;
                this.d = kn;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v1, types: [o60] */
            /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection] */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                LinearLayout linearLayout;
                ?? arrayList;
                final SupportFaqPartBase supportFaqPartBase = this.e;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(supportFaqPartBase.requireContext());
                ((C1426Lb0) supportFaqPartBase.k()).i.removeAllViews();
                ((C1426Lb0) supportFaqPartBase.k()).e.removeAllViews();
                ((C1426Lb0) supportFaqPartBase.k()).h.removeAllViews();
                ((C1426Lb0) supportFaqPartBase.k()).g.removeAllViews();
                for (final C1114Hb0 c1114Hb0 : (List) obj) {
                    int iOrdinal = c1114Hb0.a.ordinal();
                    if (iOrdinal == 0) {
                        linearLayout = ((C1426Lb0) supportFaqPartBase.k()).i;
                    } else if (iOrdinal == 1) {
                        linearLayout = ((C1426Lb0) supportFaqPartBase.k()).h;
                    } else if (iOrdinal == 2) {
                        linearLayout = ((C1426Lb0) supportFaqPartBase.k()).e;
                    } else {
                        if (iOrdinal != 3) {
                            throw new C6489s51();
                        }
                        linearLayout = ((C1426Lb0) supportFaqPartBase.k()).g;
                    }
                    Intrinsics.checkNotNull(linearLayout);
                    Intrinsics.checkNotNull(layoutInflaterFrom);
                    View viewInflate = layoutInflaterFrom.inflate(R.layout.faq_item, (ViewGroup) null);
                    viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    List<Integer> list = c1114Hb0.f;
                    if (list != null) {
                        arrayList = new ArrayList(XE.m(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(supportFaqPartBase.getString(((Number) it.next()).intValue()));
                        }
                    } else {
                        arrayList = C5653o60.d;
                    }
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    final String string = supportFaqPartBase.getString(c1114Hb0.b, Arrays.copyOf(strArr, strArr.length));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    ((TextView) viewInflate.findViewById(R.id.faq_item_text)).setText(string);
                    viewInflate.setOnClickListener(new View.OnClickListener() { // from class: oV1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object obj2 = supportFaqPartBase.i;
                            Intrinsics.checkNotNull(obj2);
                            final C6572sV1 c6572sV1 = (C6572sV1) obj2;
                            c6572sV1.getClass();
                            final C1114Hb0 faqItemUI = c1114Hb0;
                            Intrinsics.checkNotNullParameter(faqItemUI, "faqItemUI");
                            final String questionText = string;
                            Intrinsics.checkNotNullParameter(questionText, "questionText");
                            C5189lv.k(C8056za.j(c6572sV1), null, new C6782tV1(faqItemUI, c6572sV1, null), 3).W(new Function1() { // from class: rV1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    C6572sV1 c6572sV2 = c6572sV1;
                                    ReporterApi reporterApi = c6572sV2.e;
                                    EnumC5028l80 enumC5028l80 = EnumC5028l80.m0;
                                    C1114Hb0 c1114Hb1 = faqItemUI;
                                    EnumC1036Gb0 enumC1036Gb0 = c1114Hb1.a;
                                    String strName = enumC1036Gb0.name();
                                    Iterable iterable = (Iterable) c6572sV2.g.d.getValue();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj4 : iterable) {
                                        if (((C1114Hb0) obj4).a == enumC1036Gb0) {
                                            arrayList2.add(obj4);
                                        }
                                    }
                                    ReporterApi.a.b(reporterApi, enumC5028l80, new C2469Ya0(arrayList2.indexOf(c1114Hb1) + 1, strName, questionText), VE.c(EnumC5326ma.e), 8);
                                    return Unit.a;
                                }
                            });
                        }
                    });
                    linearLayout.addView(viewInflate);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, SupportFaqPartBase supportFaqPartBase) {
            super(2, jm);
            this.g = fp1;
            this.h = supportFaqPartBase;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C0476a c0476a = new C0476a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0476a, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6153qV1(FP0 fp0, FP1 fp1, JM jm, SupportFaqPartBase supportFaqPartBase) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = supportFaqPartBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6153qV1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6153qV1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.g, aVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
