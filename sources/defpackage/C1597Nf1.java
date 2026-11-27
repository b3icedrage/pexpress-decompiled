package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.v;
import com.api.core.backend.domain.models.responseModels.SupportQuestionType;
import com.base.feature.support.support.screens.popular_questions.SupportPopularQuestionsPartBase;
import com.pexpress.tool.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Nf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1597Nf1 extends v<C5053lG, b> {

    @NotNull
    public static final a f = new a();

    @NotNull
    public final SupportPopularQuestionsPartBase.a e;

    /* JADX INFO: renamed from: Nf1$a */
    public static final class a extends p.e<C5053lG> {
        @Override // androidx.recyclerview.widget.p.e
        public final boolean a(C5053lG c5053lG, C5053lG c5053lG2) {
            C5053lG oldItem = c5053lG;
            C5053lG newItem = c5053lG2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean b(C5053lG c5053lG, C5053lG c5053lG2) {
            C5053lG oldItem = c5053lG;
            C5053lG newItem = c5053lG2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.a(oldItem.a, newItem.a);
        }
    }

    /* JADX INFO: renamed from: Nf1$b */
    public final class b extends RecyclerView.C {

        @NotNull
        public final C1753Pf1 u;
        public final /* synthetic */ C1597Nf1 v;

        /* JADX INFO: renamed from: Nf1$b$a */
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
        public b(@NotNull C1597Nf1 c1597Nf1, C1753Pf1 binding) {
            super(binding.d);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.v = c1597Nf1;
            this.u = binding;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1597Nf1(@NotNull SupportPopularQuestionsPartBase.a onItemClick) {
        super(f);
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.e = onItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        Pair pair;
        b holder = (b) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C5053lG c5053lGO = o(i);
        Intrinsics.checkNotNullExpressionValue(c5053lGO, "getItem(...)");
        final C5053lG item = c5053lGO;
        Intrinsics.checkNotNullParameter(item, "item");
        C1753Pf1 c1753Pf1 = holder.u;
        CardView cardView = c1753Pf1.d;
        final C1597Nf1 c1597Nf1 = holder.v;
        cardView.setOnClickListener(new View.OnClickListener() { // from class: Of1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e.invoke(item.b);
            }
        });
        c1753Pf1.g.setText(item.a);
        int i2 = b.a.a[item.c.ordinal()];
        if (i2 == 1) {
            pair = new Pair(Integer.valueOf(R.drawable.ic_account_activation_question), Integer.valueOf(R.color.supportAccountActivationQuestion));
        } else if (i2 == 2) {
            pair = new Pair(Integer.valueOf(R.drawable.ic_trading_question), Integer.valueOf(R.color.supportTradingQuestion));
        } else if (i2 == 3) {
            pair = new Pair(Integer.valueOf(R.drawable.ic_deposit_withdraw_question), Integer.valueOf(R.color.supportDepositWithdrawQuestion));
        } else {
            if (i2 != 4) {
                throw new C6489s51();
            }
            pair = new Pair(Integer.valueOf(R.drawable.ic_verification_question), Integer.valueOf(R.color.supportVerificationQuestion));
        }
        int iIntValue = ((Number) pair.d).intValue();
        int iIntValue2 = ((Number) pair.e).intValue();
        ImageView popularQuestionIcon = c1753Pf1.e;
        Intrinsics.checkNotNullExpressionValue(popularQuestionIcon, "popularQuestionIcon");
        C3435dm0.e(popularQuestionIcon, iIntValue, EnumC7035uh1.g);
        CardView cardView2 = c1753Pf1.d;
        cardView2.setCardBackgroundColor(cardView2.getContext().getColor(iIntValue2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C1753Pf1 c1753Pf1B = C1753Pf1.b(LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_question_item, parent, false));
        Intrinsics.checkNotNullExpressionValue(c1753Pf1B, "inflate(...)");
        return new b(this, c1753Pf1B);
    }
}
