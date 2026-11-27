package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.a;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: Bc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0650Bc1 extends K60 {
    public final int e;
    public EditText f;
    public final ViewOnClickListenerC7740y3 g;

    public C0650Bc1(@NonNull a aVar, int i) {
        super(aVar);
        this.e = R.drawable.design_password_eye;
        this.g = new ViewOnClickListenerC7740y3(this, 3);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.K60
    public final void b() {
        q();
    }

    @Override // defpackage.K60
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.K60
    public final int d() {
        return this.e;
    }

    @Override // defpackage.K60
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.K60
    public final boolean k() {
        return true;
    }

    @Override // defpackage.K60
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.K60
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // defpackage.K60
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.K60
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
