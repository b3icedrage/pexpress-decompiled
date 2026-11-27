package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.v;
import com.api.core.backend.domain.models.responseModels.SupportQuestionType;
import com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6307rD0 extends v<C5266mG, b> {

    @NotNull
    public static final a f = new a();

    @NotNull
    public final SupportIssueCategoriesPartBase.a e;

    /* JADX INFO: renamed from: rD0$a */
    public static final class a extends p.e<C5266mG> {
        @Override // androidx.recyclerview.widget.p.e
        public final boolean a(C5266mG c5266mG, C5266mG c5266mG2) {
            C5266mG oldItem = c5266mG;
            C5266mG newItem = c5266mG2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean b(C5266mG c5266mG, C5266mG c5266mG2) {
            C5266mG oldItem = c5266mG;
            C5266mG newItem = c5266mG2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.equals(newItem);
        }
    }

    /* JADX INFO: renamed from: rD0$b */
    public final class b extends RecyclerView.C {

        @NotNull
        public final C6727tD0 u;
        public final /* synthetic */ C6307rD0 v;

        /* JADX INFO: renamed from: rD0$b$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[SupportQuestionType.values().length];
                try {
                    iArr[SupportQuestionType.ACCOUNT_ACTIVATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SupportQuestionType.TRADING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SupportQuestionType.DEPOSIT_WITHDRAW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SupportQuestionType.VERIFICATION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C6307rD0 c6307rD0, C6727tD0 binding) {
            super(binding.d);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.v = c6307rD0;
            this.u = binding;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6307rD0(@NotNull SupportIssueCategoriesPartBase.a onItemClick) {
        super(f);
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.e = onItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        int i2;
        b holder = (b) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C5266mG c5266mGO = o(i);
        Intrinsics.checkNotNullExpressionValue(c5266mGO, "getItem(...)");
        final C5266mG item = c5266mGO;
        Intrinsics.checkNotNullParameter(item, "item");
        C6727tD0 c6727tD0 = holder.u;
        LinearLayout linearLayout = c6727tD0.d;
        final C6307rD0 c6307rD0 = holder.v;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: sD0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e.invoke(item.b);
            }
        });
        c6727tD0.g.setText(item.a);
        int i3 = b.a.a[item.c.ordinal()];
        if (i3 == 1) {
            i2 = R.drawable.ic_account_activation_category;
        } else if (i3 == 2) {
            i2 = R.drawable.ic_trading_category;
        } else if (i3 == 3) {
            i2 = R.drawable.ic_deposit_withdraw_category;
        } else {
            if (i3 != 4) {
                throw new C6489s51();
            }
            i2 = R.drawable.ic_verification_category;
        }
        ImageView categoryIcon = c6727tD0.e;
        Intrinsics.checkNotNullExpressionValue(categoryIcon, "categoryIcon");
        C3435dm0.e(categoryIcon, i2, EnumC7035uh1.g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.issue_category_item, parent, false);
        int i2 = R.id.category_icon;
        ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.category_icon);
        if (imageView != null) {
            i2 = R.id.category_item_text;
            TextView textView = (TextView) C3476e.h(viewInflate, R.id.category_item_text);
            if (textView != null) {
                C6727tD0 c6727tD0 = new C6727tD0((LinearLayout) viewInflate, imageView, textView);
                Intrinsics.checkNotNullExpressionValue(c6727tD0, "inflate(...)");
                return new b(this, c6727tD0);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }
}
