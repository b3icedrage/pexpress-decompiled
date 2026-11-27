package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: vN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7176vN extends D0 {
    public final ArrayList a = new ArrayList(0);

    /* JADX INFO: renamed from: vN$a */
    public interface a {
        void a(@NonNull C5318mX0 c5318mX0, @NonNull String str, int i);
    }

    public static void g(@NonNull C5318mX0 c5318mX0, String str, @NonNull String str2, @NonNull AbstractC1634Ns abstractC1634Ns) {
        c5318mX0.b();
        int iC = c5318mX0.c();
        C5292mO1 c5292mO1 = c5318mX0.c;
        StringBuilder sb = c5292mO1.d;
        sb.append((char) 160);
        sb.append('\n');
        c5318mX0.a.b.getClass();
        c5292mO1.b(sb.length(), str2);
        sb.append((CharSequence) str2);
        c5318mX0.b();
        c5292mO1.a((char) 160);
        AbstractC7387wN.g.b(c5318mX0.b, str);
        c5318mX0.d(abstractC1634Ns, iC);
        c5318mX0.a(abstractC1634Ns);
    }

    @Override // defpackage.D0, defpackage.InterfaceC4217hX0
    public final void a(@NonNull C4427iX0.a aVar) {
        C7780yE c7780yE = new C7780yE(0);
        aVar.a(MS1.class, new C7780yE(1));
        aVar.a(Y50.class, new C2874b60());
        aVar.a(C2180Us.class, new C2444Xs());
        aVar.a(C7359wE.class, new AE(0));
        aVar.a(C2752ac0.class, c7780yE);
        aVar.a(C0946Ex0.class, c7780yE);
        aVar.a(IQ0.class, new KQ0());
        aVar.a(C4071go0.class, new AE(1));
        aVar.a(C5717oQ0.class, new C6766tQ0());
        aVar.a(C6162qY1.class, new C6791tY1());
    }

    @Override // defpackage.D0, defpackage.InterfaceC4217hX0
    public final void d(@NonNull TextView textView) {
        if (textView.getMovementMethod() == null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // defpackage.D0, defpackage.InterfaceC4217hX0
    public final void e(@NonNull TextView textView, @NonNull SpannableStringBuilder spannableStringBuilder) {
        C5115la1[] c5115la1Arr = (C5115la1[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C5115la1.class);
        if (c5115la1Arr != null) {
            TextPaint paint = textView.getPaint();
            for (C5115la1 c5115la1 : c5115la1Arr) {
                c5115la1.h = (int) (paint.measureText(c5115la1.e) + 0.5f);
            }
        }
        C5742oY1[] c5742oY1Arr = (C5742oY1[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C5742oY1.class);
        if (c5742oY1Arr != null) {
            for (C5742oY1 c5742oY1 : c5742oY1Arr) {
                spannableStringBuilder.removeSpan(c5742oY1);
            }
        }
        C5742oY1 c5742oY2 = new C5742oY1();
        new WeakReference(textView);
        spannableStringBuilder.setSpan(c5742oY2, 0, spannableStringBuilder.length(), 18);
    }

    @Override // defpackage.D0, defpackage.InterfaceC4217hX0
    public final void f(@NonNull C5318mX0.a aVar) {
        aVar.a(RX1.class, new C5287mN(this));
        aVar.a(MS1.class, new C5497nN());
        aVar.a(Y50.class, new C5707oN());
        aVar.a(C2180Us.class, new C5917pN());
        aVar.a(C7359wE.class, new C6127qN(0));
        aVar.a(C2752ac0.class, new C6336rN());
        aVar.a(C0946Ex0.class, new C6546sN());
        aVar.a(C4095gw0.class, new C6756tN());
        aVar.a(C1329Jv.class, new C6127qN(1));
        aVar.a(C4905ka1.class, new C6127qN(1));
        aVar.a(IQ0.class, new C6966uN());
        aVar.a(C6162qY1.class, new C3976gN());
        aVar.a(C4071go0.class, new C4186hN());
        aVar.a(RN1.class, new C4396iN());
        aVar.a(C1072Gn0.class, new C4654jN());
        aVar.a(C1349Kb1.class, new C4864kN());
        aVar.a(C5717oQ0.class, new C5074lN());
    }
}
