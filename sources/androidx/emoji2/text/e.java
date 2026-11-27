package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import defpackage.C0959Fb1;
import defpackage.C3060c01;
import defpackage.C4888kV;
import defpackage.T50;
import defpackage.U50;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    @NonNull
    public final g a;

    @NonNull
    public final C4888kV b;

    public static final class a {
        public int a = 1;
        public final g.a b;
        public g.a c;
        public g.a d;
        public int e;
        public int f;

        public a(g.a aVar) {
            this.b = aVar;
            this.c = aVar;
        }

        public final int a(int i) {
            SparseArray<g.a> sparseArray = this.c.a;
            g.a aVar = sparseArray == null ? null : sparseArray.get(i);
            int i2 = 1;
            int i3 = 2;
            if (this.a == 2) {
                if (aVar != null) {
                    this.c = aVar;
                    this.f++;
                } else if (i == 65038) {
                    b();
                } else if (i != 65039) {
                    g.a aVar2 = this.c;
                    if (aVar2.b != null) {
                        i3 = 3;
                        if (this.f != 1) {
                            this.d = aVar2;
                            b();
                        } else if (c()) {
                            this.d = this.c;
                            b();
                        } else {
                            b();
                        }
                    } else {
                        b();
                    }
                }
                i2 = i3;
            } else if (aVar == null) {
                b();
            } else {
                this.a = 2;
                this.c = aVar;
                this.f = 1;
                i2 = i3;
            }
            this.e = i;
            return i2;
        }

        public final void b() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
        }

        public final boolean c() {
            C3060c01 c3060c01B = this.c.b.b();
            int iA = c3060c01B.a(6);
            return !(iA == 0 || c3060c01B.b.get(iA + c3060c01B.a) == 0) || this.e == 65039;
        }
    }

    public e(@NonNull g gVar, @NonNull c.h hVar, @NonNull C4888kV c4888kV) {
        this.a = gVar;
        this.b = c4888kV;
    }

    public static boolean a(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z) {
        U50[] u50Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (u50Arr = (U50[]) editable.getSpans(selectionStart, selectionEnd, U50.class)) != null && u50Arr.length > 0) {
                for (U50 u50 : u50Arr) {
                    int spanStart = editable.getSpanStart(u50);
                    int spanEnd = editable.getSpanEnd(u50);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i, int i2, T50 t50) {
        if (t50.c == 0) {
            C4888kV c4888kV = this.b;
            C3060c01 c3060c01B = t50.b();
            int iA = c3060c01B.a(8);
            if (iA != 0) {
                c3060c01B.b.getShort(iA + c3060c01B.a);
            }
            c4888kV.getClass();
            ThreadLocal<StringBuilder> threadLocal = C4888kV.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c4888kV.a;
            String string = sb.toString();
            int i3 = C0959Fb1.a;
            t50.c = C0959Fb1.a.a(textPaint, string) ? 2 : 1;
        }
        return t50.c == 2;
    }
}
