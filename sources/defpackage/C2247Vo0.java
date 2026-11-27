package defpackage;

import com.jivosite.sdk.model.pojo.history.History;
import com.jivosite.sdk.model.pojo.history.HistoryMessage;
import com.jivosite.sdk.model.pojo.history.HistoryResult;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Vo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2247Vo0 extends ML0 implements Function1<HistoryResult, List<? extends HistoryMessage>> {
    public static final C2247Vo0 d = new C2247Vo0(1);

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends HistoryMessage> invoke(HistoryResult historyResult) {
        List<HistoryMessage> list;
        HistoryResult it = historyResult;
        Intrinsics.checkNotNullParameter(it, "it");
        History history = it.c;
        return (history == null || (list = history.d) == null) ? C5653o60.d : list;
    }
}
