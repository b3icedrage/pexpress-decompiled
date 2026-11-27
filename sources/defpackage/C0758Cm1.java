package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0758Cm1 extends H7<RA> {

    @NotNull
    public final C6845tm1 u;

    /* JADX INFO: renamed from: Cm1$a */
    public static final class a extends ML0 implements Function1<String, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String rating = str;
            Intrinsics.checkNotNullParameter(rating, "it");
            C6845tm1 c6845tm1 = C0758Cm1.this.u;
            c6845tm1.getClass();
            Intrinsics.checkNotNullParameter(rating, "rating");
            c6845tm1.e.g(rating);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0758Cm1(@NotNull View itemView, @NotNull FP0 lifecycleOwner, @NotNull C6845tm1 viewModel) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.u = viewModel;
        int i = H00.D;
        DataBinderMapperImpl dataBinderMapperImpl = C5302mS.a;
        H00 h00 = (H00) ViewDataBinding.n(null, itemView, R.layout.dg_item_rating);
        h00.A(viewModel);
        h00.x(lifecycleOwner);
        h00.A.setOnJivoRatingBarChangeListener(new a());
        TextInputEditText textInputEditText = h00.z;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.comment");
        textInputEditText.addTextChangedListener(new b());
    }

    @Override // defpackage.H7
    public final void q(@NotNull F7<RA> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.q(item);
        RA raA = item.a();
        if (raA instanceof C7896ym1) {
            this.u.j(raA);
        }
    }

    /* JADX INFO: renamed from: Cm1$b */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            C6845tm1 c6845tm1 = C0758Cm1.this.u;
            String comment = String.valueOf(charSequence);
            c6845tm1.getClass();
            Intrinsics.checkNotNullParameter(comment, "comment");
            c6845tm1.e.r(comment);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
