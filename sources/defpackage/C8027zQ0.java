package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: zQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8027zQ0 extends D0 {

    /* JADX INFO: renamed from: zQ0$a */
    public static class a implements C7176vN.a {
        @Override // defpackage.C7176vN.a
        public final void a(@NonNull C5318mX0 c5318mX0, @NonNull String str, int i) {
            C3797fX0 c3797fX0 = c5318mX0.a;
            InterfaceC3771fO1 interfaceC3771fO1 = c3797fX0.e.a.get(C5717oQ0.class);
            if (interfaceC3771fO1 == null) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (Linkify.addLinks(spannableStringBuilder, 7)) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                if (uRLSpanArr == null || uRLSpanArr.length <= 0) {
                    return;
                }
                for (URLSpan uRLSpan : uRLSpanArr) {
                    C5151lj1<String> c5151lj1 = AbstractC7387wN.e;
                    String url = uRLSpan.getURL();
                    C4047gi c4047gi = c5318mX0.b;
                    c5151lj1.b(c4047gi, url);
                    Object objA = interfaceC3771fO1.a(c3797fX0, c4047gi);
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan) + i;
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan) + i;
                    C5292mO1 c5292mO1 = c5318mX0.c;
                    int length = c5292mO1.d.length();
                    if (spanEnd > spanStart && spanStart >= 0 && spanEnd <= length) {
                        C5292mO1.c(c5292mO1, objA, spanStart, spanEnd);
                    }
                }
            }
        }
    }

    @Override // defpackage.D0, defpackage.InterfaceC4217hX0
    public final void c(@NonNull C3242cr1 c3242cr1) {
        InterfaceC4217hX0 interfaceC4217hX0;
        InterfaceC4217hX0 interfaceC4217hX1;
        Iterator it = c3242cr1.b.iterator();
        do {
            interfaceC4217hX0 = null;
            if (!it.hasNext()) {
                interfaceC4217hX1 = null;
                break;
            }
            interfaceC4217hX1 = (InterfaceC4217hX0) it.next();
        } while (!C7176vN.class.isAssignableFrom(interfaceC4217hX1.getClass()));
        if (interfaceC4217hX1 == null) {
            ArrayList<InterfaceC4217hX0> arrayList = c3242cr1.a;
            for (InterfaceC4217hX0 interfaceC4217hX2 : arrayList) {
                if (C7176vN.class.isAssignableFrom(interfaceC4217hX2.getClass())) {
                    interfaceC4217hX0 = interfaceC4217hX2;
                    break;
                }
            }
            if (interfaceC4217hX0 == null) {
                throw new IllegalStateException("Requested plugin is not added: " + C7176vN.class.getName() + ", plugins: " + arrayList);
            }
            c3242cr1.a(interfaceC4217hX0);
            interfaceC4217hX1 = interfaceC4217hX0;
        }
        ((C7176vN) interfaceC4217hX1).a.add(new a());
    }
}
