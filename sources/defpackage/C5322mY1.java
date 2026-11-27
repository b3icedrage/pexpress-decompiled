package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: mY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.utils.TextViewKt$updateDrawables$1", f = "TextView.kt", l = {236}, m = "invokeSuspend")
public final class C5322mY1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ TextView h;

    /* JADX INFO: renamed from: mY1$a */
    @InterfaceC3368dU(c = "com.api.utils.TextViewKt$updateDrawables$1$1", f = "TextView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ TextView d;
        public final /* synthetic */ ArrayList e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextView textView, ArrayList arrayList, JM jm) {
            super(2, jm);
            this.d = textView;
            this.e = arrayList;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.d, this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            ArrayList arrayList = this.e;
            this.d.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) arrayList.get(0), (Drawable) arrayList.get(1), (Drawable) arrayList.get(2), (Drawable) arrayList.get(3));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5322mY1(Integer num, Integer num2, TextView textView, JM jm) {
        super(2, jm);
        this.e = num;
        this.g = num2;
        this.h = textView;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5322mY1(this.e, this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5322mY1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        TextView textView;
        Drawable drawable;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            List listF = WE.f(this.e, null, this.g, null);
            ArrayList arrayList = new ArrayList(XE.m(listF, 10));
            Iterator it = listF.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                textView = this.h;
                if (!zHasNext) {
                    break;
                }
                Integer num = (Integer) it.next();
                if (num != null) {
                    C6025ps1 c6025ps1D = com.bumptech.glide.a.c(textView.getContext()).m(new Integer(num.intValue())).d();
                    FutureC0932Es1 futureC0932Es1 = new FutureC0932Es1();
                    c6025ps1D.M(futureC0932Es1, futureC0932Es1, c6025ps1D, C3387da0.b);
                    drawable = (Drawable) futureC0932Es1.get();
                } else {
                    drawable = null;
                }
                arrayList.add(drawable);
            }
            RV rv = C6266r20.a;
            AbstractC8109zn0 abstractC8109zn0 = QV0.a;
            a aVar = new a(textView, arrayList, null);
            this.d = 1;
            if (C5189lv.p(abstractC8109zn0, aVar, this) == mn) {
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
