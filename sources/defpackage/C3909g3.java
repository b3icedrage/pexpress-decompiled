package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3909g3 implements InterfaceC3699f3 {

    @Nullable
    public C6937uD0 d;

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.item_account, viewGroup, false);
        int i = R.id.account_balance;
        TextView textView = (TextView) C3476e.h(viewInflate, R.id.account_balance);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            i = R.id.account_currency;
            TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.account_currency);
            if (textView2 != null) {
                i = R.id.account_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C3476e.h(viewInflate, R.id.account_icon);
                if (appCompatImageView != null) {
                    i = R.id.account_name;
                    TextView textView3 = (TextView) C3476e.h(viewInflate, R.id.account_name);
                    if (textView3 != null) {
                        C6937uD0 c6937uD0 = new C6937uD0(linearLayout, textView, linearLayout, textView2, appCompatImageView, textView3);
                        this.d = c6937uD0;
                        Intrinsics.checkNotNull(c6937uD0);
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
                        return linearLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC3699f3
    @NotNull
    public final View b() {
        C6937uD0 c6937uD0 = this.d;
        Intrinsics.checkNotNull(c6937uD0);
        LinearLayout accountContainer = c6937uD0.g;
        Intrinsics.checkNotNullExpressionValue(accountContainer, "accountContainer");
        return accountContainer;
    }

    @Override // defpackage.InterfaceC3699f3
    @NotNull
    public final TextView e() {
        C6937uD0 c6937uD0 = this.d;
        Intrinsics.checkNotNull(c6937uD0);
        TextView accountBalance = c6937uD0.e;
        Intrinsics.checkNotNullExpressionValue(accountBalance, "accountBalance");
        return accountBalance;
    }

    @Override // defpackage.InterfaceC3699f3
    @NotNull
    public final ImageView getIcon() {
        C6937uD0 c6937uD0 = this.d;
        Intrinsics.checkNotNull(c6937uD0);
        AppCompatImageView accountIcon = c6937uD0.i;
        Intrinsics.checkNotNullExpressionValue(accountIcon, "accountIcon");
        return accountIcon;
    }

    @Override // defpackage.InterfaceC3699f3
    @NotNull
    public final TextView getTitle() {
        C6937uD0 c6937uD0 = this.d;
        Intrinsics.checkNotNull(c6937uD0);
        TextView accountName = c6937uD0.j;
        Intrinsics.checkNotNullExpressionValue(accountName, "accountName");
        return accountName;
    }

    @Override // defpackage.InterfaceC3699f3
    @NotNull
    public final TextView j() {
        C6937uD0 c6937uD0 = this.d;
        Intrinsics.checkNotNull(c6937uD0);
        TextView accountCurrency = c6937uD0.h;
        Intrinsics.checkNotNullExpressionValue(accountCurrency, "accountCurrency");
        return accountCurrency;
    }
}
