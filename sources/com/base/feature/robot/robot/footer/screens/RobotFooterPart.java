package com.base.feature.robot.robot.footer.screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.pexpress.tool.R;
import defpackage.AM;
import defpackage.AW1;
import defpackage.C0944Ew1;
import defpackage.C1699On1;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3265cz0;
import defpackage.C3399dd0;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C4;
import defpackage.C4254hh0;
import defpackage.C4466ii;
import defpackage.C5189lv;
import defpackage.C6456rw1;
import defpackage.C6876tw1;
import defpackage.C7086uw1;
import defpackage.C7507ww1;
import defpackage.C7652xe;
import defpackage.EnumC4403iP0;
import defpackage.EnumC7035uh1;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import defpackage.Sd2;
import defpackage.WE;
import defpackage.XE;
import defpackage.XO0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/robot/footer/screens/RobotFooterPart;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "Lww1;", "LEw1;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobotFooterPart extends SimpleFragmentInflate<C7507ww1, C0944Ew1> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C0944Ew1> {
        public static final a m = new a(3, C0944Ew1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/RobotFragmentFooterBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C0944Ew1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.robot_fragment_footer, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            int i = R.id.footer_first_separator;
            if (C3476e.h(viewInflate, R.id.footer_first_separator) != null) {
                i = R.id.footer_second_separator;
                if (C3476e.h(viewInflate, R.id.footer_second_separator) != null) {
                    i = R.id.robot_footer_first_item;
                    View viewH = C3476e.h(viewInflate, R.id.robot_footer_first_item);
                    if (viewH != null) {
                        C4254hh0 c4254hh0B = C4254hh0.b(viewH);
                        View viewH2 = C3476e.h(viewInflate, R.id.robot_footer_second_item);
                        if (viewH2 != null) {
                            C4254hh0 c4254hh0B2 = C4254hh0.b(viewH2);
                            View viewH3 = C3476e.h(viewInflate, R.id.robot_footer_third_item);
                            if (viewH3 != null) {
                                return new C0944Ew1(linearLayout, c4254hh0B, c4254hh0B2, C4254hh0.b(viewH3));
                            }
                            i = R.id.robot_footer_third_item;
                        } else {
                            i = R.id.robot_footer_second_item;
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.footer.screens.RobotFooterPart$setup$$inlined$launchAndCollectIn$default$1", f = "RobotFooterPart.kt", l = {48}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ C1699On1 g;
        public final /* synthetic */ RobotFooterPart h;

        @InterfaceC3368dU(c = "com.base.feature.robot.robot.footer.screens.RobotFooterPart$setup$$inlined$launchAndCollectIn$default$1$1", f = "RobotFooterPart.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ C1699On1 g;
            public final /* synthetic */ RobotFooterPart h;

            /* JADX INFO: renamed from: com.base.feature.robot.robot.footer.screens.RobotFooterPart$b$a$a, reason: collision with other inner class name */
            public static final class C0296a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ RobotFooterPart e;

                public C0296a(KN kn, RobotFooterPart robotFooterPart) {
                    this.e = robotFooterPart;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    List list = (List) obj;
                    RobotFooterPart robotFooterPart = this.e;
                    C0944Ew1 c0944Ew1 = (C0944Ew1) robotFooterPart.k();
                    C4254hh0 c4254hh0 = c0944Ew1.e;
                    Pair pair = new Pair(c4254hh0.e, c4254hh0.g);
                    C4254hh0 c4254hh1 = c0944Ew1.g;
                    Pair pair2 = new Pair(c4254hh1.e, c4254hh1.g);
                    C4254hh0 c4254hh2 = c0944Ew1.h;
                    List listF = WE.f(pair, pair2, new Pair(c4254hh2.e, c4254hh2.g));
                    Iterator<T> it = list.iterator();
                    Iterator<T> it2 = listF.iterator();
                    ArrayList arrayList = new ArrayList(Math.min(XE.m(list, 10), XE.m(listF, 10)));
                    while (it.hasNext() && it2.hasNext()) {
                        T next = it.next();
                        Pair pair3 = (Pair) it2.next();
                        C6456rw1 c6456rw1 = (C6456rw1) next;
                        TextView textView = (TextView) pair3.d;
                        ImageView imageView = (ImageView) pair3.e;
                        String string = robotFooterPart.getString(c6456rw1.b);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        List<Object> list2 = c6456rw1.c;
                        ArrayList arrayList2 = new ArrayList(XE.m(list2, 10));
                        for (T source : list2) {
                            Intrinsics.checkNotNullParameter(robotFooterPart, "<this>");
                            Intrinsics.checkNotNullParameter(source, "source");
                            Context contextRequireContext = robotFooterPart.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            arrayList2.add(AM.a(contextRequireContext, source));
                        }
                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
                        String str = String.format(string, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        textView.setText(str);
                        C3435dm0.e(imageView, c6456rw1.a, EnumC7035uh1.g);
                        arrayList.add(Unit.a);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1699On1 c1699On1, JM jm, RobotFooterPart robotFooterPart) {
                super(2, jm);
                this.g = c1699On1;
                this.h = robotFooterPart;
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
                    C0296a c0296a = new C0296a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.d.c(c0296a, this) == mn) {
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
        public b(FP0 fp0, C1699On1 c1699On1, JM jm, RobotFooterPart robotFooterPart) {
            super(2, jm);
            this.e = fp0;
            this.g = c1699On1;
            this.h = robotFooterPart;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new b(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
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

    public RobotFooterPart(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.m = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C1699On1 c1699On1F = C4466ii.f(((C7507ww1) obj).e);
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new b(viewLifecycleOwner, c1699On1F, null, this), 3);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C4 c4 = new C4(this, 4);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C3265cz0(new C3399dd0(this, 2), 6));
        return C2151Ui0.a(this, C2017Sp1.a.b(C7507ww1.class), new C6876tw1(interfaceC3770fO0A, 0), new C7086uw1(interfaceC3770fO0A), c4);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C0944Ew1> g() {
        return this.m;
    }
}
