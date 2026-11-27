package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4007gX0 extends AbstractC3587eX0 {
    public final C6595sc1 b;
    public final C5105lX0 c;
    public final List<InterfaceC4217hX0> d;
    public final TextView.BufferType a = TextView.BufferType.SPANNABLE;
    public final boolean e = true;

    public C4007gX0(@NonNull C6595sc1 c6595sc1, @NonNull C5105lX0 c5105lX0, @NonNull List list) {
        this.b = c6595sc1;
        this.c = c5105lX0;
        this.d = list;
    }

    @Override // defpackage.AbstractC3587eX0
    public final void a(@NonNull TextView textView, @NonNull String str) {
        List<InterfaceC4217hX0> list = this.d;
        Iterator<InterfaceC4217hX0> it = list.iterator();
        String strB = str;
        while (it.hasNext()) {
            strB = it.next().b(strB);
        }
        C6595sc1 c6595sc1 = this.b;
        c6595sc1.getClass();
        if (strB == null) {
            throw new NullPointerException("input must not be null");
        }
        N20 n20 = new N20(c6595sc1.a, c6595sc1.c, c6595sc1.b);
        int i = 0;
        while (true) {
            int length = strB.length();
            int i2 = i;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                char cCharAt = strB.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                break;
            }
            n20.i(strB.substring(i, i2));
            i = i2 + 1;
            if (i < strB.length() && strB.charAt(i2) == '\r' && strB.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (strB.length() > 0 && (i == 0 || i < strB.length())) {
            n20.i(strB.substring(i));
        }
        n20.f(n20.n);
        C5473nF c5473nF = new C5473nF(n20.k, n20.m);
        n20.j.getClass();
        C7348wA0 c7348wA0 = new C7348wA0(c5473nF);
        Iterator it2 = n20.o.iterator();
        while (it2.hasNext()) {
            ((InterfaceC2024Ss) it2.next()).g(c7348wA0);
        }
        AbstractC6909u51 abstractC6909u51A = n20.l.a;
        Iterator it3 = c6595sc1.d.iterator();
        while (it3.hasNext()) {
            abstractC6909u51A = ((InterfaceC2143Uf1) it3.next()).a();
        }
        Iterator<InterfaceC4217hX0> it4 = list.iterator();
        while (it4.hasNext()) {
            it4.next().getClass();
        }
        C5105lX0 c5105lX0 = this.c;
        c5105lX0.getClass();
        C4047gi c4047gi = new C4047gi();
        C5318mX0.a aVar = c5105lX0.a;
        C5318mX0 c5318mX0 = new C5318mX0(c5105lX0.b, c4047gi, new C5292mO1(), Collections.unmodifiableMap(aVar.a), new C3686f());
        abstractC6909u51A.a(c5318mX0);
        Iterator<InterfaceC4217hX0> it5 = list.iterator();
        while (it5.hasNext()) {
            it5.next().getClass();
        }
        C5292mO1 c5292mO1 = c5318mX0.c;
        SpannableStringBuilder bVar = new C5292mO1.b(c5292mO1.d);
        for (C5292mO1.a aVar2 : c5292mO1.e) {
            bVar.setSpan(aVar2.a, aVar2.b, aVar2.c, aVar2.d);
        }
        if (TextUtils.isEmpty(bVar) && this.e && !TextUtils.isEmpty(str)) {
            bVar = new SpannableStringBuilder(str);
        }
        Iterator<InterfaceC4217hX0> it6 = list.iterator();
        while (it6.hasNext()) {
            it6.next().e(textView, bVar);
        }
        textView.setText(bVar, this.a);
        Iterator<InterfaceC4217hX0> it7 = list.iterator();
        while (it7.hasNext()) {
            it7.next().d(textView);
        }
    }
}
