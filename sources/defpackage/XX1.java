package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class XX1 {
    public float c;
    public final WeakReference<b> e;
    public SX1 f;
    public final TextPaint a = new TextPaint(1);
    public final a b = new a();
    public boolean d = true;

    public class a extends G1 {
        public a() {
        }

        @Override // defpackage.G1
        public final void o(int i) {
            XX1 xx1 = XX1.this;
            xx1.d = true;
            b bVar = xx1.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // defpackage.G1
        public final void p(@NonNull Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            XX1 xx1 = XX1.this;
            xx1.d = true;
            b bVar = xx1.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public XX1(b bVar) {
        this.e = new WeakReference<>(null);
        this.e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.c;
        }
        float fMeasureText = str == null ? 0.0f : this.a.measureText((CharSequence) str, 0, str.length());
        this.c = fMeasureText;
        this.d = false;
        return fMeasureText;
    }

    public final void b(SX1 sx1, Context context) {
        if (this.f != sx1) {
            this.f = sx1;
            if (sx1 != null) {
                TextPaint textPaint = this.a;
                a aVar = this.b;
                sx1.f(context, textPaint, aVar);
                b bVar = this.e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                sx1.e(context, textPaint, aVar);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
