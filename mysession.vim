let SessionLoad = 1
let s:so_save = &g:so | let s:siso_save = &g:siso | setg so=0 siso=0 | setl so=-1 siso=-1
let v:this_session=expand("<sfile>:p")
silent only
silent tabonly
cd ~/workspace/myapp
if expand('%') == '' && !&modified && line('$') <= 1 && getline(1) == ''
  let s:wipebuf = bufnr('%')
endif
let s:shortmess_save = &shortmess
if &shortmess =~ 'A'
  set shortmess=aoOA
else
  set shortmess=aoO
endif
badd +46 src/main/java/com/example/myapp/service/PokedexService.java
badd +1 src/main/java/com/example/myapp/config/PropertyConfig.java
badd +1 ~/.config/nvim/lua/config/init.lua
badd +1 ~/.config/nvim/lua/plugins/init.lua
badd +16 ~/.config/nvim/lua/plugins/config/nvim-lspconfig.lua
badd +24 src/main/java/com/example/myapp/service/ItemService.java
badd +1 ~/workspace/myapp
badd +28 src/main/java/com/example/myapp/service/StatusService.java
badd +25 src/main/java/com/example/myapp/service/TranslateService.java
badd +32 src/main/java/com/example/myapp/service/TypeService.java
badd +1 ~/workspace/vim-script-study/main.vim
badd +707 ~/workspace/vim-script-study/memo.md
badd +10 ~/.config/nvim/lua/plugins/config/nvim-treesitter.lua
badd +1 ~/.config/nvim/lua/plugins/config/mason.lua
badd +1 ~/.config/nvim/lua/plugins/config/nvterm.lua
badd +1 ~/.config/nvim/init.lua
argglobal
%argdel
set stal=2
tabnew +setlocal\ bufhidden=wipe
tabrewind
edit src/main/java/com/example/myapp/service/PokedexService.java
argglobal
balt src/main/java/com/example/myapp/config/PropertyConfig.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 46 - ((23 * winheight(0) + 22) / 44)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 46
normal! 021|
lcd ~/workspace/myapp
tabnext
edit ~/.config/nvim/lua/plugins/config/nvim-lspconfig.lua
argglobal
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 39 - ((10 * winheight(0) + 22) / 44)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 39
normal! 0
if exists(':tcd') == 2 | tcd ~/.config/nvim/lua | endif
tabnext 1
set stal=1
if exists('s:wipebuf') && len(win_findbuf(s:wipebuf)) == 0 && getbufvar(s:wipebuf, '&buftype') isnot# 'terminal'
  silent exe 'bwipe ' . s:wipebuf
endif
unlet! s:wipebuf
set winheight=1 winwidth=20
let &shortmess = s:shortmess_save
let s:sx = expand("<sfile>:p:r")."x.vim"
if filereadable(s:sx)
  exe "source " . fnameescape(s:sx)
endif
let &g:so = s:so_save | let &g:siso = s:siso_save
set hlsearch
nohlsearch
doautoall SessionLoadPost
unlet SessionLoad
" vim: set ft=vim :
