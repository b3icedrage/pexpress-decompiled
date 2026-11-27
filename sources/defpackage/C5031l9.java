package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.jivosite.sdk.model.pojo.message.ClientMessage;
import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5031l9 extends EZ0<L8> {

    @NotNull
    public final C5454n9 v;

    @NotNull
    public final AbstractC3587eX0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5031l9(@NotNull View itemView, @NotNull FP0 lifecycleOwner, @NotNull C5454n9 viewModel, @NotNull SF0 jivoChatViewModel, @NotNull AbstractC3587eX0 markwon) {
        super(itemView, viewModel);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(jivoChatViewModel, "jivoChatViewModel");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.v = viewModel;
        this.w = markwon;
        int i = AbstractC7098v00.F;
        DataBinderMapperImpl dataBinderMapperImpl = C5302mS.a;
        final AbstractC7098v00 abstractC7098v00 = (AbstractC7098v00) ViewDataBinding.n(null, itemView, R.layout.dg_item_agent_text);
        abstractC7098v00.getClass();
        abstractC7098v00.A(viewModel);
        abstractC7098v00.x(lifecycleOwner);
        viewModel.l = jivoChatViewModel;
        itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: i9
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ClipboardManager clipboardManager;
                C5031l9 this$0 = this.d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                L8 l8 = (L8) this$0.v.k.d();
                String strA = l8 != null ? l8.a() : null;
                Context context = this$0.r();
                Intrinsics.checkNotNullParameter(context, "context");
                if (strA == null || (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) == null) {
                    return true;
                }
                clipboardManager.setPrimaryClip(ClipData.newPlainText("text", strA));
                Toast.makeText(this$0.r(), R.string.toast_copied_to_clipboard, 0).show();
                return true;
            }
        });
        viewModel.k.e(lifecycleOwner, new InterfaceC4819k81() { // from class: j9
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                L8 l8 = (L8) obj;
                final C5031l9 this$0 = this.a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String str = l8.a.d;
                int i2 = 0;
                boolean zC = StringsKt.C(str, "⦀", false);
                AbstractC7098v00 abstractC7098v01 = abstractC7098v00;
                TextView textView = abstractC7098v01.C;
                if (!zC) {
                    this$0.w.a(textView, str);
                    return;
                }
                final List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"⦀"}, false, 0, 6, null);
                this$0.w.a(textView, (String) CollectionsKt.F(listSplit$default));
                boolean z = l8.c;
                ChipGroup chipGroup = abstractC7098v01.A;
                if (!z) {
                    Intrinsics.checkNotNullExpressionValue(chipGroup, "binding.buttons");
                    chipGroup.setVisibility(8);
                    return;
                }
                chipGroup.removeAllViewsInLayout();
                Intrinsics.checkNotNullExpressionValue(chipGroup, "");
                chipGroup.setVisibility(0);
                if (chipGroup.getChildCount() == 0) {
                    for (Object obj2 : listSplit$default) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            WE.l();
                            throw null;
                        }
                        String str2 = (String) obj2;
                        if (i2 > 0) {
                            Chip chip = new Chip(chipGroup.getContext(), null);
                            chip.setText(str2);
                            chip.setId(i2);
                            chipGroup.addView(chip);
                        }
                        i2 = i3;
                    }
                    chipGroup.setOnCheckedStateChangeListener(new ChipGroup.d() { // from class: k9
                        @Override // com.google.android.material.chip.ChipGroup.d
                        public final void a(ChipGroup chipGroup2, ArrayList checkedIds) {
                            C5031l9 this$1 = this$0;
                            Intrinsics.checkNotNullParameter(this$1, "this$0");
                            List it = listSplit$default;
                            Intrinsics.checkNotNullParameter(it, "$it");
                            Intrinsics.checkNotNullParameter(chipGroup2, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(checkedIds, "checkedIds");
                            C5454n9 c5454n9 = this$1.v;
                            Object objF = CollectionsKt.F(checkedIds);
                            Intrinsics.checkNotNullExpressionValue(objF, "checkedIds.first()");
                            String data = (String) it.get(((Number) objF).intValue());
                            Intrinsics.checkNotNullParameter(data, "text");
                            Intrinsics.checkNotNullParameter("text/plain", "type");
                            Intrinsics.checkNotNullParameter(data, "data");
                            String string = UUID.randomUUID().toString();
                            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                            ClientMessage message = new ClientMessage(string, System.currentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), "text/plain", data, TZ0.c.a);
                            c5454n9.getClass();
                            Intrinsics.checkNotNullParameter(message, "message");
                            SF0 sf0 = c5454n9.l;
                            if (sf0 != null) {
                                sf0.n(message);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // defpackage.H7
    public final void q(@NotNull F7<RA> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.q(item);
        RA raA = item.a();
        if (raA instanceof L8) {
            this.v.j(raA);
        }
    }
}
