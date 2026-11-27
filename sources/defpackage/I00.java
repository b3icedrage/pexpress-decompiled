package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.jivosite.sdk.model.pojo.rate.RateSettings;
import com.jivosite.sdk.ui.views.JivoRatingBar;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class I00 extends H00 implements T81.a {
    public static final SparseIntArray I;

    @NonNull
    public final LinearLayoutCompat E;
    public final T81 F;
    public final T81 G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.title, 3);
        sparseIntArray.put(R.id.description, 4);
        sparseIntArray.put(R.id.rating, 5);
        sparseIntArray.put(R.id.icon_first, 6);
        sparseIntArray.put(R.id.icon_second, 7);
        sparseIntArray.put(R.id.icon_third, 8);
        sparseIntArray.put(R.id.icon_fourth, 9);
        sparseIntArray.put(R.id.icon_fifth, 10);
        sparseIntArray.put(R.id.commentLayout, 11);
        sparseIntArray.put(R.id.comment, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public I00(InterfaceC5089lS interfaceC5089lS, @NonNull View view) {
        Object[] objArrS = ViewDataBinding.s(view, 13, I);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) objArrS[1];
        TextInputEditText textInputEditText = (TextInputEditText) objArrS[12];
        JivoRatingBar jivoRatingBar = (JivoRatingBar) objArrS[5];
        MaterialButton materialButton = (MaterialButton) objArrS[2];
        super(interfaceC5089lS, view, appCompatImageButton, textInputEditText, jivoRatingBar, materialButton);
        this.H = -1L;
        this.y.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArrS[0];
        this.E = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        this.B.setTag(null);
        y(view);
        this.F = new T81(this, 2);
        this.G = new T81(this, 1);
        synchronized (this) {
            this.H = 8L;
        }
        v();
    }

    @Override // defpackage.H00
    public final void A(C6845tm1 c6845tm1) {
        this.C = c6845tm1;
        synchronized (this) {
            this.H |= 4;
        }
        j(3);
        v();
    }

    @Override // T81.a
    public final void b(int i) {
        C6845tm1 c6845tm1;
        if (i != 1) {
            if (i == 2 && (c6845tm1 = this.C) != null) {
                c6845tm1.e.C();
                return;
            }
            return;
        }
        C6845tm1 c6845tm2 = this.C;
        if (c6845tm2 != null) {
            c6845tm2.e.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // androidx.databinding.ViewDataBinding
    public final void o() {
        long j;
        C1774Pm1 c1774Pm1;
        EditText editText;
        RateSettings.a aVar;
        RateSettings.b bVar;
        String string;
        RateSettings.a aVar2;
        RateSettings.b bVar2;
        String string2;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        C6845tm1 c6845tm1 = this.C;
        long j2 = 13 & j;
        String string3 = null;
        if (j2 == 0) {
            c1774Pm1 = null;
        } else {
            EY0 ey0 = c6845tm1 != null ? c6845tm1.f : null;
            z(0, ey0);
            if (ey0 != null) {
                c1774Pm1 = (C1774Pm1) ey0.d();
            } else {
                c1774Pm1 = null;
            }
        }
        if ((j & 8) != 0) {
            this.y.setOnClickListener(this.G);
            this.B.setOnClickListener(this.F);
        }
        if (j2 != 0) {
            LinearLayoutCompat view = this.E;
            Intrinsics.checkNotNullParameter(view, "layout");
            if (c1774Pm1 != null) {
                Context context = view.getContext();
                C1852Qm1 c1852Qm1 = (C1852Qm1) view.getTag();
                if (c1852Qm1 == null) {
                    c1852Qm1 = new C1852Qm1(view);
                    view.setTag(c1852Qm1);
                }
                AbstractC8106zm1 abstractC8106zm1 = c1774Pm1.b;
                if (abstractC8106zm1 instanceof AbstractC8106zm1.b) {
                    return;
                }
                boolean z = abstractC8106zm1 instanceof AbstractC8106zm1.c;
                MaterialButton materialButton = c1852Qm1.e;
                TextView textView = c1852Qm1.b;
                TextView textView2 = c1852Qm1.a;
                TextInputLayout textInputLayout = c1852Qm1.d;
                JivoRatingBar jivoRatingBar = c1852Qm1.c;
                RateSettings rateSettings = c1774Pm1.a;
                if (z) {
                    if (textView2 != null) {
                        textView2.setText(context.getString(R.string.rate_form_title));
                    }
                    if (textView != null) {
                        if (C6104qF0.i.d) {
                            string2 = context.getString(R.string.rate_form_description);
                        } else {
                            string2 = rateSettings != null ? rateSettings.e : null;
                        }
                        textView.setText(string2);
                    }
                    if (jivoRatingBar != null) {
                        jivoRatingBar.setVisibility(0);
                    }
                    if (textInputLayout != null) {
                        textInputLayout.setVisibility(8);
                    }
                    if (materialButton != null) {
                        materialButton.setVisibility(8);
                    }
                    if (jivoRatingBar != null) {
                        String str = (rateSettings == null || (bVar2 = rateSettings.a) == null) ? null : bVar2.d;
                        String str2 = (rateSettings == null || (aVar2 = rateSettings.b) == null) ? null : aVar2.d;
                        int i = JivoRatingBar.z;
                        jivoRatingBar.q(str, str2, null);
                        return;
                    }
                    return;
                }
                if (abstractC8106zm1 instanceof AbstractC8106zm1.a) {
                    if (textView2 != null) {
                        textView2.setText(context.getString(R.string.rate_form_title));
                    }
                    if (textView != null) {
                        if (C6104qF0.i.d) {
                            string = context.getString(R.string.rate_form_description);
                        } else {
                            string = rateSettings != null ? rateSettings.e : null;
                        }
                        textView.setText(string);
                    }
                    if (textInputLayout != null) {
                        textInputLayout.setVisibility(0);
                    }
                    if (materialButton != null) {
                        materialButton.setVisibility(0);
                    }
                    if (jivoRatingBar != null) {
                        String str3 = (rateSettings == null || (bVar = rateSettings.a) == null) ? null : bVar.d;
                        if (rateSettings != null && (aVar = rateSettings.b) != null) {
                            string3 = aVar.d;
                        }
                        jivoRatingBar.q(str3, string3, ((AbstractC8106zm1.a) abstractC8106zm1).a);
                    }
                    String str4 = ((AbstractC8106zm1.a) abstractC8106zm1).b;
                    if (textInputLayout == null || (editText = textInputLayout.getEditText()) == null) {
                        return;
                    }
                    if (str4 == null) {
                        editText.getText().clear();
                        return;
                    } else {
                        if (str4.equals(editText.getText().toString())) {
                            return;
                        }
                        editText.setText(str4);
                        return;
                    }
                }
                if (abstractC8106zm1 instanceof AbstractC8106zm1.d) {
                    if (textView2 != null) {
                        textView2.setText(context.getString(R.string.rate_form_finish_title));
                    }
                    if (textView != null) {
                        String str5 = ((AbstractC8106zm1.d) abstractC8106zm1).a;
                        if (Intrinsics.a(str5, "good") ? true : Intrinsics.a(str5, "goodnormal") ? true : Intrinsics.a(str5, "normal")) {
                            if (C6104qF0.i.d) {
                                string3 = context.getString(R.string.rate_form_finish_description_good);
                            } else if (rateSettings != null) {
                                string3 = rateSettings.f;
                            }
                        } else if (C6104qF0.i.d) {
                            string3 = context.getString(R.string.rate_form_finish_description_bad);
                        } else if (rateSettings != null) {
                            string3 = rateSettings.g;
                        }
                        textView.setText(string3);
                    }
                    if (jivoRatingBar != null) {
                        jivoRatingBar.setVisibility(8);
                    }
                    if (textInputLayout != null) {
                        textInputLayout.setVisibility(8);
                    }
                    if (materialButton != null) {
                        materialButton.setVisibility(8);
                    }
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    Intrinsics.checkNotNullParameter(view, "view");
                    InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    }
                }
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean t(Object obj, int i, int i2) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.H |= 1;
        }
        return true;
    }
}
