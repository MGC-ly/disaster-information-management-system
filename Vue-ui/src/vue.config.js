module.export = {
    devServer: {
        proxy: 'http://localhost:4000'
        // proxy: {
        //     '/api' : {
        //         target: 'http://127.0.0.1:4523/m2/1586596-0-default/38826944',
        //         changeOrigin: true,
        //         pathRewrite: {
        //             '^/api' : ''
        //         }
        //     }
        // },
    }
}