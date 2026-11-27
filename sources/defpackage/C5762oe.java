package defpackage;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.emoji2.text.c;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5762oe {

    @NonNull
    public final EditText a;

    @NonNull
    public final O50 b;

    public C5762oe(@NonNull EditText editText) {
        this.a = editText;
        this.b = new O50(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        this.b.a.getClass();
        if (keyListener instanceof S50) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new S50(keyListener);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, C3855fm1.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final Q50 c(InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        O50 o50 = this.b;
        if (inputConnection == null) {
            o50.getClass();
            inputConnection = null;
        } else {
            O50.a aVar = o50.a;
            aVar.getClass();
            if (!(inputConnection instanceof Q50)) {
                inputConnection = new Q50(aVar.a, inputConnection, editorInfo);
            }
        }
        return (Q50) inputConnection;
    }

    public final void d(boolean z) {
        W50 w50 = this.b.a.b;
        if (w50.g != z) {
            if (w50.e != null) {
                c cVarA = c.a();
                W50.a aVar = w50.e;
                cVarA.getClass();
                U0.f(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = cVarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    cVarA.b.remove(aVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            w50.g = z;
            if (z) {
                W50.a(w50.d, c.a().b());
            }
        }
    }
}
