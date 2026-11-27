package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ZD extends EZ0<AbstractC7844yZ0> {

    @NotNull
    public final C2677aE v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZD(@NotNull View itemView, @NotNull FP0 lifecycleOwner, @NotNull C2677aE viewModel) {
        super(itemView, viewModel);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.v = viewModel;
        int i = B00.C;
        DataBinderMapperImpl dataBinderMapperImpl = C5302mS.a;
        B00 b00 = (B00) ViewDataBinding.n(null, itemView, R.layout.dg_item_client_text);
        b00.A(viewModel);
        b00.x(lifecycleOwner);
        itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: YD
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ClipboardManager clipboardManager;
                ZD this$0 = this.d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String str = (String) this$0.v.k.d();
                Context context = this$0.r();
                Intrinsics.checkNotNullParameter(context, "context");
                if (str == null || (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) == null) {
                    return true;
                }
                clipboardManager.setPrimaryClip(ClipData.newPlainText("text", str));
                Toast.makeText(this$0.r(), R.string.toast_copied_to_clipboard, 0).show();
                return true;
            }
        });
    }

    @Override // defpackage.H7
    public final void q(@NotNull F7<RA> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.q(item);
        RA raA = item.a();
        if (raA instanceof AbstractC7844yZ0) {
            this.v.j(raA);
        }
    }
}
