package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {ConnectionResult.API_DISABLED_FOR_CONNECTION}, m = "readObject")
public final class PH0 extends LM {
    public DU d;
    public QH0 e;
    public LinkedHashMap g;
    public String h;
    public /* synthetic */ Object i;
    public final /* synthetic */ QH0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PH0(QH0 qh0, AbstractC7487wq abstractC7487wq) {
        super(abstractC7487wq);
        this.j = qh0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return QH0.a(this.j, null, this);
    }
}
